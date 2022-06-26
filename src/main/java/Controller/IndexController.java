package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.StudentDAO;
import Model.Student;

@WebServlet("")
public class IndexController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse respone) throws IOException, ServletException {
			ArrayList<Student> studs = new ArrayList<>();
			StudentDAO iDao = new StudentDAO();
			studs = iDao.getAllStudent();
			request.setAttribute("students", studs);
			RequestDispatcher rd = request.getRequestDispatcher("Index.jsp");			
			rd.forward(request, respone);
	}
}
