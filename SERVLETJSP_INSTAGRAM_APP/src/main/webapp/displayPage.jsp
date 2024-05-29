<%@ page import="dao.UserDao"%>
<%@ page import="dto.UserDto"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Instagram Users</title>
 <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap" rel="stylesheet">
<style>
    body {
        font-family: 'Poppins', sans-serif;
        background-color: #000;
        color: #fff;
        display: flex;
        justify-content: center;
        align-items: center;
        flex-direction: column;
        padding: 20px;
    }
    .container {
        display: flex;
        flex-wrap: wrap;
        justify-content: center;
        gap: 20px;
    }
    .card {
        background: #fff;
        border: 1px solid #dbdbdb;
        border-radius: 10px;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        padding: 20px;
        margin: 10px;
        width: 300px;
        color: #333;
        background-color: white;
    }
    .card h3 {
        font-size: 20px;
        margin-bottom: 15px;
        font-weight: 600;
        color: #333;
    }
    .card p {
        margin: 5px 0;
        color: black;
    }
    .card p strong {
        color: black;
    }
    .card button {
        margin: 5px;
        padding: 10px 20px;
        border: none;
        border-radius: 5px;
        background-color: #0095f6;
        color: white;
        font-size: 14px;
        cursor: pointer;
        transition: background-color 0.3s ease;
    }
    .card button:hover {
        background-color: #007bb5;
    }
    h3{
        color: orange;
    }.icons {
	    display: flex;
	    justify-content: space-between;
	    margin-top: 10px;
    }
   .icons i {
		font-size: 24px;
	    color: #333;
		cursor: pointer;
		}
	.icons i:hover {
		color: #0095f6; /* Change color on hover */
		}  
		
</style>
</head>
<body>
<h3>Instagram User's Data</h3>
<h4>Login Successful</h4>
<div class="container">
<% 
UserDao userDao = new UserDao();
List<UserDto> userDtosList = userDao.getAllUsers();
for(UserDto i : userDtosList) {
%>
    <div class="card">
        <h3 style="color: orange">Instagram</h3>
        <p><strong>User ID: <%= i.getUserId() %> </strong></p>
        <p><strong>User Name: <%= i.getUserName() %></strong></p>
        <p><strong>Email: <%= i.getUserEmail() %></strong></p>
        <p><strong>Phone Number: <%= i.getUserPhoneNumber() %></strong></p>
        <p style="color: red"><strong>Password: ***** </strong></p>    
        <a href="update?id=<%= i.getUserId() %>"><button>update</button></a>    
        <a href="delete?id=<%= i.getUserId() %>"><button>Delete</button></a>
        <hr>
         <div class="icons">
        <i class="fas fa-home"></i>
        <i class="fas fa-search"></i>
        <i class="fas fa-heart"></i>
        <i class="fas fa-upload"></i>
    </div>
    </div>
<% } %>
</div>
</body>
</html>
