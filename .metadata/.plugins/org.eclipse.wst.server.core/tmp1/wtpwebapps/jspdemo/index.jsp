
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String fname = request.getParameter("fname");
   String lname = request.getParameter("lname");
   String gender = request.getParameter("r1");
  // String course1 = request.getParameter("c1");
   String[] courses = request.getParameterValues("c1");
   
  
%>
<%

Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/join_test?user=mysql&password=mysql");
PreparedStatement psmt = con.prepareStatement("insert into stud values(?,?,?)");
psmt.setString(1 , fname);
psmt.setString(2 , lname);
psmt.setString(3, gender);
psmt.executeUpdate();
con.close();
psmt.close();
out.print(fname);

%> 
<center><h1> Student information </h1></center>
<table border="2">
<tr><th>Name :</th>
<th> LName :</th>
<th>Gender :</th>
<th colspan="3"> Course :</th>
</tr>
<tr><td><%=fname %></td>
<td> <%=lname %></td>
<td><%=gender %></td>
<td><%=courses[0] %></td>
<td><%= courses[1] %></td>
</tr>
</table>

</body>
</html>