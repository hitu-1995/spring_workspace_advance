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
         background-color: purple;
         color: yellow;
         padding: 20px;
     }
     .content {
         background-color: #ff66ff;
         color: black;
         padding: 20px;
         font-weight: bold;
     }
</style>
 </head>

<body>
   <div class="header" align="center">
       <h1>Welcome to Register Page</h1>

   </div>
           <hr> 
    <div class="content" align="center">
         <form action="reg">
            <lable>Rollno </lable>
            <input type="text" name="rollno"><br><br>
            <lable>Name </lable>
            <input type="text" name="name"><br><br>
            <lable>Marks </lable>
            <input type="text" name="marks"><br><br>
            <lable>Mobile </lable>
            <input type="text" name="mobile"><br><br>
            <lable>Email </lable>
            <input type="text" name="email"><br><br>
   
            <input type="submit" value="REGISTER"><br><br>
         </form>
    </div>
</body>
</html>