package Controller;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.StudentDAO;
import Model.Student;

@WebServlet("/edit")
public class EditController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse respone) throws IOException, ServletException {
		int id = Integer.parseInt(request.getParameter("id"));
		StudentDAO stuDAO = new StudentDAO();
		Student s = stuDAO.getStudentById(id);
		request.setAttribute("student", s);
		RequestDispatcher rd = request.getRequestDispatcher("Edit.jsp");
		rd.forward(request, respone);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse respone) throws IOException, ServletException {
	
		Student s = new Student();
		s.setId(Integer.parseInt(request.getParameter("id")));
		s.setName(request.getParameter("name"));
		s.setEmail(request.getParameter("email"));
		s.setPoint(Double.parseDouble(request.getParameter("point")));
		StudentDAO stuDAO = new StudentDAO();
		stuDAO.EditStudent(s);
		respone.sendRedirect("");
	}
}
