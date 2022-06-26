package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.StudentDAO;
import Model.Student;

@WebServlet("/add")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse respone) throws IOException, ServletException {
		RequestDispatcher rd = request.getRequestDispatcher("Add.jsp");
		rd.forward(request, respone);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse respone) throws IOException, ServletException {
		Student s = new Student();
		s.setName(request.getParameter("name"));
		s.setEmail(request.getParameter("email"));
		s.setPoint(Double.parseDouble(request.getParameter("point")));
		StudentDAO stuDAO = new StudentDAO();
		stuDAO.insertStudent(s);
		RequestDispatcher rd = request.getRequestDispatcher("Add.jsp");
		rd.forward(request, respone);
		
	}
}
