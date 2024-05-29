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

@WebServlet("/edit")
public class editUser extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException {
		// gamechanger which is taken from updatePage.jsp
		//but not from displayPage.jsp
        int idfromcard=Integer.parseInt(req.getParameter("userId"));
        
		UserDao userDao=new UserDao();
		UserDto userDto=userDao.getById(idfromcard);
		String userName=req.getParameter("userName");
		String useremailID=req.getParameter("emailID");
		String userPassword=req.getParameter("password");
		long userPhoneNumber=Long.parseLong(req.getParameter("phoneNumber"));
				
		userDto.setUserName(userName);
		userDto.setUserEmail(useremailID);
		userDto.setUserPhoneNumber(userPhoneNumber);
		userDto.setUserPassword(userPassword);
			
		userDao.update(userDto);
		
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("displayPage.jsp");
		requestDispatcher.forward(req, resp);		
	}	
}
