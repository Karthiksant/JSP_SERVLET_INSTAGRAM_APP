<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Instagram Style Login Page</title>
<style>	
    body {
        font-family: 'Arial', sans-serif;
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
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.3);
        border-radius: 10px;
        text-align: center;
    }
    .container h3 {
        font-family: 'Poppins', sans-serif;
        font-size: 32px;
        margin-bottom: 20px;
        font-weight:bold ;
        color: orange;
        text-shadow: 3px 3px 3px rgba(0, 0, 0, 0.2);
    }
    .container button {
        width: 100%;
        padding: 10px;
        margin: 10px 0;
        border: none;
        background-color: #0095f6;
        color: white;
        font-size: 14px;
        border-radius: 5px;
        cursor: pointer;
    }
    .container button:hover {
        background-color: #007bb5;
    }
    .container a {
        text-decoration: none;
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
    <h3> Instagram</h3>
    <hr>
    <a href="signupPage.jsp"><button>Sign Up</button></a>
    <a href="loginPage.jsp"><button>Login</button></a>
    <div class="footer">
    &copy; 2024 Instagram from Meta
</div>
</div>

</body>
</html>
