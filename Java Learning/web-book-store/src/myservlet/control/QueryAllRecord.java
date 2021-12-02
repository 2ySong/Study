package myservlet.control;
import mybean.data.DataByPage;
import com.sun.rowset.*;
import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class QueryAllRecord extends HttpServlet{
   CachedRowSetImpl rowSet=null;
   public void init(ServletConfig config) throws ServletException{
      super.init(config);
      try {  Class.forName("com.mysql.cj.jdbc.Driver");
      }
      catch(Exception e){} 
   }
   public void doPost(HttpServletRequest request,HttpServletResponse response) 
                        throws ServletException,IOException{
      request.setCharacterEncoding("gb2312");
      String idNumber= request.getParameter("fenleiNumber");
      if(idNumber==null) 
          idNumber="0";
      int id = Integer.parseInt(idNumber);
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
      String uri="jdbc:mysql://localhost:3306/shop?user=root&password=8784szy2810&characterEncoding=gb2312&useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
      try{ 
           con=DriverManager.getConnection(uri,"root","123456");
           Statement sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                                ResultSet.CONCUR_READ_ONLY);
           ResultSet rs=sql.executeQuery("SELECT * FROM cosmeticForm where id = "+id);
           rowSet=new CachedRowSetImpl();   //?????§Þ?????
           rowSet.populate(rs);
           dataBean.setRowSet(rowSet);      //?§Þ????›¥??dataBean??  
           con.close();                     //???????
           System.out.println("QueryAllRecord - select");
      }
      catch(SQLException exp){}
      response.sendRedirect("byPageShow.jsp");//?????byPageShow.jsp
   } 
   public void doGet(HttpServletRequest request,
              HttpServletResponse response) 
                        throws ServletException,IOException{
       doPost(request,response);
   }
}
