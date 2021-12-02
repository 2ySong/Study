package myservlet.control;
import mybean.data.DataByPage;
import com.sun.rowset.*;
import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class SearchByCondition extends HttpServlet{
   CachedRowSetImpl rowSet=null;
   public void init(ServletConfig config) throws ServletException{
      super.init(config);
      try {  Class.forName("com.mysql.ci.jdbc.Driver");
      }
      catch(Exception e){} 
   }
   public void doPost(HttpServletRequest request,HttpServletResponse response) 
                        throws ServletException,IOException{
      request.setCharacterEncoding("gb2312");
      String searchMess= request.getParameter("searchMess");
      String radioMess= request.getParameter("radio");
      if(searchMess==null||searchMess.length()==0) {
         fail(request,response,"??§Ó?????????????");
         return;
      }
      String condition="";
      if(radioMess.equals("cosmetic_number")) {
          condition = 
         "SELECT * FROM cosmeticForm where cosmetic_number ='"+searchMess+"'";
      }
      else if(radioMess.equals("cosmetic_name")) {
          condition = 
         "SELECT * FROM cosmeticForm where cosmetic_name LIKE '%"+searchMess+"%'"; 
      }
      else if(radioMess.equals("cosmetic_price")) {
          double max=0,min=0;
          String regex = "[^0123456789.]";
          String [] priceMess =searchMess.split(regex);
          if(priceMess.length==1) {
             max =min = Double.parseDouble(priceMess[0]);
          }
          else if(priceMess.length==2) {
             min = Double.parseDouble(priceMess[0]);
             max = Double.parseDouble(priceMess[1]);
             if(max<min) {
                double t = max;
                max = min;
                min = t;
             }
          }
          else {
             fail(request,response,"??????????§Õ???");
             return; 
          }
          condition =  "SELECT * FROM cosmeticForm where "+
          "cosmetic_price <= "+max+" AND cosmetic_price>="+min ;
      }
      HttpSession session=request.getSession(true); 
      Connection con=null; 
      DataByPage dataBean=null;
      try{ 
           dataBean=(DataByPage)session.getAttribute("dataBean");
           if(dataBean==null){
              dataBean=new DataByPage();  //????Javabean????
              session.setAttribute("dataBean",dataBean);
           }
      }
      catch(Exception exp){
           dataBean=new DataByPage();  
           session.setAttribute("dataBean",dataBean);
      } 
      String uri = "jdbc:mysql://localhost:3306/shop?user=root&password=8784szy2810&characterEncoding=gb2312&useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
      try{ 
           con=DriverManager.getConnection(uri);
           Statement sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                                ResultSet.CONCUR_READ_ONLY);
           ResultSet rs=sql.executeQuery(condition);
           rowSet=new CachedRowSetImpl();   //?????§Þ?????
           rowSet.populate(rs);
           dataBean.setRowSet(rowSet);      //?§Þ???????dataBean??  
           con.close();                     //???????
           
           System.out.println("SearchByCondition - select");
      }
      catch(SQLException exp){}
      response.sendRedirect("byPageShow.jsp");//?????byPageShow.jsp
   } 
   public void doGet(HttpServletRequest request,
              HttpServletResponse response) 
                        throws ServletException,IOException{
       doPost(request,response);
   }
   public void fail(HttpServletRequest request,HttpServletResponse response,
                      String backNews) {
        response.setContentType("text/html;charset=GB2312");
        try {
         PrintWriter out=response.getWriter();
         out.println("<html><body>");
         out.println("<h2>"+backNews+"</h2>") ;
         out.println("?????");
         out.println("<a href =searchCosmetic.jsp>???????</a>");
         out.println("</body></html>");
        }
        catch(IOException exp){}
    }
}
