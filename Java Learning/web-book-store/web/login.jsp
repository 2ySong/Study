<%@ page contentType="text/html;charset=GB2312" %>
<jsp:useBean id="loginBean" class="mybean.data.Login" scope="session"/>
<HTML>
<HEAD>
    <%@ include file="head.txt" %>
    <style type="text/css"></style>
</HEAD>
<BODY background="9.jpg"><font size=2>
</font>
<div align="center">
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p><font size="8" face="Georgia, Times New Roman, Times, serif">网上书店</font></p>
    <p>&nbsp; </p>
    <table width="311" height="175" border=2>
        <tr>
            <th width="168" height="29"><font size="4" face="宋体">用户登录</font></th>
        </tr>
        <td height="7">
        <td width="10"><>
        <td width="10">
        <td height="9">
        <td width="10">
            <FORM action="HandleLogin" Method="post">
        <td width="10">
        <td height="23">
        <td width="61"></font>
            <tr>
                <td height="46"><p><font size="3">用户名称</font><font size="3">:
                    <Input type=text name="logname">
                </font></p></td>
            </tr>
            <tr>
                <td height="67"><font size="3">输入密码:
                    <Input type=password name="password"></font></td>
            </tr>
    </table>
    <font size="2"><Input type=submit name="g" value="提交">
        <label>
            <input type="reset" name="Submit2" value="重 置"/>
        </label>
    </font>
    <p><font size="2">
        </FORM>
    </font></p>
    <p>&nbsp;</p>
</div>
<font size=2>
    <div align="center">
        登录反馈信息:
        <jsp:getProperty name="loginBean" property="backNews"/>
        <br>登录名称:
        <jsp:getProperty name="loginBean" property="logname"/>
    </div>
</font>
</BODY>
</HTML>
