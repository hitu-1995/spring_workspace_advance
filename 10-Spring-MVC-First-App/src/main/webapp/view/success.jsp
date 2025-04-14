<%@page import="com.abc.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Styled Table</title>
  <style>
    body {
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      margin: 40px;
      background-color: #f4f6f8;
    }

    table {
      border-collapse: collapse;
      width: 100%;
      max-width: 800px;
      margin: auto;
      background-color: #ffffff;
      box-shadow: 0 4px 8px rgba(0,0,0,0.05);
      border-radius: 8px;
      overflow: hidden;
    }

    thead {
      background-color: #0077cc;
      color: white;
    }

    th, td {
      text-align: left;
      padding: 12px 20px;
    }

    tr:nth-child(even) {
      background-color: #f9f9f9;
    }

    tr:hover {
      background-color: #f1f1f1;
    }

    caption {
      caption-side: top;
      font-size: 1.5em;
      margin: 10px;
      font-weight: bold;
      color: #333;
    }
  </style>
</head>
<body>
  <%List<Student> stuList = (List<Student>) request.getAttribute("data"); %>
<table>
  <caption>Student Information</caption>
  <thead>
    <tr>
      <th>Rollno</th>
      <th>Name</th>
      <th>Marks</th>
      <th>Mobile</th>
      <th>Email</th>
    </tr>
  </thead>
  <tbody>
     <%for(Student stu : stuList) {%>
    <tr>
      <td><%=stu.getRollno()%></td>
      <td><%=stu.getName()%></td>
      <td><%=stu.getMarks()%></td>
      <td><%=stu.getMobile()%></td>
      <td><%=stu.getEmail()%></td>
    </tr>
    <% } %>
  </tbody>
</table>

</body>
</html>
