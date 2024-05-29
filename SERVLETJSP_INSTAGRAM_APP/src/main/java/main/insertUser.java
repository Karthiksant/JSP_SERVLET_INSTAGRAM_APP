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

@WebServlet("/signup")
public class insertUser extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException {
		String userName=req.getParameter("userName");
		String userEmail=req.getParameter("emailID");
		long userPhone=Long.parseLong(req.getParameter("phoneNumber")); 
		String userPassord=req.getParameter("password");
		
		UserDto userDto=new UserDto();
		
		userDto.setUserName(userName);
		userDto.setUserEmail(userEmail);
		userDto.setUserPassword(userPassord);
		userDto.setUserPhoneNumber(userPhone);
		
		UserDao userDao=new UserDao();
		userDao.save(userDto);
	   
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("displayPage.jsp");
		requestDispatcher.forward(req, resp);
	}	
}
