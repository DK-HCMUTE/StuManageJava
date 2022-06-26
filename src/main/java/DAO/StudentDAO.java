package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Model.Student;

public class StudentDAO {
	private Connection conn = Config.getConnection();

	public ArrayList<Student> getAllStudent() {
		ArrayList<Student> stus = new ArrayList<>();
		try {

			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("Select * from students");
			while (rs.next()) {
				Student student = new Student();
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setEmail(rs.getString("email"));
				student.setPoint(rs.getDouble("point"));
				stus.add(student);
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return stus;
	}

	public Student getStudentById(int id) {
		Student student = new Student();
		try {

			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("Select * from students where id="+id);
			rs.next();
			student.setId(rs.getInt("id"));
			student.setName(rs.getString("name"));
			student.setEmail(rs.getString("email"));
			student.setPoint(rs.getDouble("point"));

		} catch (Exception e) {
			e.getMessage();
		}
		return student;
	}

	public void insertStudent(Student s) {
		try {
			String sql = "Insert into students(name,email,point) values(?,?,?)";
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, s.getName());
			st.setString(2, s.getEmail());
			st.setDouble(3, s.getPoint());
			st.executeUpdate();

		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void DeleteStudent(int id) {
		try {
			String sql = "delete from students where id = ?";
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1, id);
			st.executeUpdate();
		} catch (Exception e) {

			e.getMessage();
		}
	}

	public void EditStudent(Student s) {
		try {
			String sql = "update students set name = ?, email = ?, point = ? where id = ?";
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, s.getName());
			st.setString(2, s.getEmail());
			st.setDouble(3, s.getPoint());
			st.setInt(4, s.getId());
			st.executeUpdate();
		} catch (Exception e) {

			e.getMessage();
		}
	}
}
