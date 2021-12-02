<%@ page contentType="text/html;charset=GB2312" %>
<HTML><HEAD><%@ include file="head.txt" %></HEAD>
<BODY background=image/back.jpg><font size=2>
<div align="center">
<br>查询时可以输入图书相关信息或图书名称及价格。<br>
图书名称支持模糊查询。
<br>输入价格是在2个值之间的价格，格式是：价格1-价格2<br>
例如 258-689 
<FORM action="searchByConditionServlet" Method="post" >
   <br>输入查询信息:<Input type=text name="searchMess"><br>
   <Input type =radio name="radio" value="cosmetic_number">图书版本号
   <Input type =radio name="radio" value="cosmetic_name" checked="ok">图书名称
   <Input type =radio name="radio" value="cosmetic_price">图书价格
   <br><Input type=submit name="g" value="提交">
</Form>
</div>
</Font></BODY></HTML>
