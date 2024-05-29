package main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;

@WebServlet("/delete")
public class deleteUser extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException , IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		UserDao userDao=new UserDao();
		userDao.deleteUser(id);
	}
}
