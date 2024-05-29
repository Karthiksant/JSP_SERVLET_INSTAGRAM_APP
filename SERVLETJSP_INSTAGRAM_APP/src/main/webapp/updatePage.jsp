<%@page import="javax.persistence.*"%>
<%@page import="org.apache.catalina.connector.Request"%>
<%@page import="dto.UserDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Instagram Sign Up</title>
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap" rel="stylesheet">
<style>
    body {
        font-family: 'Poppins', sans-serif;
        background-color: #fafafa;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }
    .container {
        width: 350px;
        padding: 40px;
        background: #fff;
        border: 1px solid #dbdbdb;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        border-radius: 10px;
        text-align: center;
        text-shadow: 3px 3px 3px rgba(0, 0, 0, 0.2);
    }
    .container h3 {
        font-family: 'Poppins', sans-serif;
        font-size: 32px;
        margin-bottom: 20px;
        font-weight:bold ;
        color: orange;
    }
    .container form {
        display: flex;
        flex-direction: column;
        gap: 15px;
    }
    .container label {
        text-align: left;
        font-weight: 600;
        margin-bottom: 5px;
    }
    .container input[type="text"],
    .container input[type="password"] {
        width: 100%;
        padding: 10px;
        border: 1px solid #dbdbdb;
        border-radius: 5px;
        box-sizing: border-box;
        font-size: 14px;
    }
    .container input[type="submit"] {
        padding: 10px;
        background-color: #0095f6;
        color: white;
        font-size: 14px;
        font-weight: 600;
        border: none;
        border-radius: 5px;
        cursor: pointer;
    }
    .container input[type="submit"]:hover {
        background-color: #007bb5;
    }
    .footer {
        margin-top: 20px;
        font-size: 12px;
        color: #8e8e8e;
    }
</style>
</head>
<body style="background-color: black">
<div class="container">
    <h3>Edit Insta-ID</h3>
    <hr>  
    <form action="edit" method="post">
    <% UserDto userDto=(UserDto) request.getAttribute("userDto");%>
        <label for="userId">Enter UserName</label>
        <input name="userId" value="<%= userDto.getUserId() %>" type="number" >
        
        <label for="userName">Enter UserName</label>
        <input name="userName" value="<%= userDto.getUserName() %>" type="text" >
        
        <label for="emailID">Enter Email-ID</label>
        <input name="emailID" value="<%= userDto.getUserEmail() %>"type="text" placeholder="Email">
        
        <label for="phoneNumber">Enter PhoneNumber</label>
        <input name="phoneNumber" value="<%= userDto.getUserPhoneNumber() %>" type="text" placeholder="Phone number">
        
        <label for="password">Enter Password</label>
        <input name="password" value="<%= userDto.getUserPassword() %>" type="password" placeholder="Password">
      
        <input type="submit" value="Update">
    </form>
    <div class="footer">
    &copy; 2024 Instagram from Meta
</div>
</div>
</body>
</html>
