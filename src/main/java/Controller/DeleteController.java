package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.StudentDAO;

@WebServlet("/delete")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse respone) throws IOException, ServletException {
		int id = Integer.parseInt(request.getParameter("id"));
		StudentDAO stuDAO = new StudentDAO();
		stuDAO.DeleteStudent(id);
		RequestDispatcher rd = request.getRequestDispatcher("");
		rd.forward(request, respone);
	}

}
