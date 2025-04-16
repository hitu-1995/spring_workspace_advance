<%@page import="com.abc.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
  
  body {
     background-color: silver;
  }
  
     .header {
         background-color: #006600;
         color: yellow;
         padding: 20px;
     }
     .content {
         background-color:  #80ff80;
         color: black;
         padding: 20px;
         font-weight: bold;
     }
</style>
 </head>

<body>
   <div class="header" align="center">
       <h1>Welcome to Update Page</h1>

   </div>
           <hr> 
           <%Student stu = (Student) request.getAttribute("stu"); %>
    <div class="content" align="center">
         <form action="update">
            <lable>Rollno  :: <%=stu.getRollno()%> </lable>
            <input type="hidden" name="rollno" value="<%=stu.getRollno()%>"><br><br>
            <lable>Name </lable>
            <input type="text" name="name" value="<%=stu.getName()%>"><br><br>
            <lable>Marks </lable>
            <input type="text" name="marks" value="<%=stu.getMarks()%>"><br><br>
            <lable>Mobile </lable>
            <input type="text" name="mobile" value="<%=stu.getMobile()%>"><br><br>
            <lable>Email </lable>
            <input type="text" name="email" value="<%=stu.getEmail()%>"><br><br>
   
            <input type="submit" value="UPDATE"><br><br>
         </form>
    </div>
</body>
</html>