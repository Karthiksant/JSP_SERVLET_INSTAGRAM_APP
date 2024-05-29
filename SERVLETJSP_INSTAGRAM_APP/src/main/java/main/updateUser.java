package main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dto.UserDto;

@WebServlet("/update")
public class updateUser extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException {
		int idfromcard=Integer.parseInt(req.getParameter("id"));
		
		UserDao userDao=new UserDao();
		UserDto userDto=userDao.getById(idfromcard);
		req.setAttribute("userDto", userDto);
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("updatePage.jsp");
		requestDispatcher.forward(req, resp);		
	}	
}
