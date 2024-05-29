package main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dto.UserDto;
@WebServlet("/login")
public class loginUser extends HttpServlet {
     @Override
     protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException, IOException {
    	
    	 String userName=req.getParameter("userName");
    	 String userPassword=req.getParameter("userPassword");
    	 
    	 UserDao userDao=new UserDao();
    	 
    	 UserDto userDto=userDao.getUserNamePassword(userName,userPassword);
    	 
    	 String dbUserName;
    	 String dbUserPassword;
    	 if (userDto!=null) {
			dbUserName=userDto.getUserName();
			dbUserPassword=userDto.getUserPassword();
			if(dbUserName.equals(userName)&&(dbUserPassword.equals(userPassword))) {
				RequestDispatcher requestDispatcher=req.getRequestDispatcher("displayPage.jsp");
				requestDispatcher.forward(req, resp);
			}
			else {
				String errorMessage = "Invalid username or password";
				req.setAttribute("errorMsg", errorMessage);
				req.getRequestDispatcher("/loginPage.jsp").forward(req, resp);
			}
			
		} else {
			String errorMessage = "Invalid username or password";
			req.setAttribute("errorMsg", errorMessage);
			req.getRequestDispatcher("/loginPage.jsp").forward(req, resp);
		}
     }
}
