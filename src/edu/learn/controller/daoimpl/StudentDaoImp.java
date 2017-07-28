package edu.learn.controller.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import edu.learn.controller.dao.StudentDao;
import edu.learn.controller.model.Login;
import edu.learn.controller.model.Student;

public class StudentDaoImp implements StudentDao {
	 @Autowired
	  DataSource datasource;
	  @Autowired
	  JdbcTemplate jdbcTemplate;
	  
	  
	@Override
	public void register(Student student) {
		String sql = "insert into student values(?,?,?,?,?,?,?)";
	    jdbcTemplate.update(sql, new Object[] { student.getStudentname(), student.getPassword(), student.getFirstname(),
	    		student.getLastname(), student.getEmail(), student.getAddress(), student.getPhone() });
	    }
		


	@Override
	public Student validateStudent(Login login) {
		
		 String sql = "select * from student where studentname='" + login.getUsername() + "' and password='" + login.getPassword()
		    + "'";
		    List<Student> students = jdbcTemplate.query(sql, new StudentMapper());
		    return students.size() > 0 ? students.get(0) : null;
		    }

}
class StudentMapper implements RowMapper<Student> {
	  public Student mapRow(ResultSet rs, int arg1) throws SQLException {
	    Student student = new Student();
	    student.setStudentname(rs.getString("studentname"));
	    student.setPassword(rs.getString("password"));
	    student.setFirstname(rs.getString("firstname"));
	    student.setLastname(rs.getString("lastname"));
	    student.setEmail(rs.getString("email"));
	    student.setAddress(rs.getString("address"));
	    student.setPhone(rs.getInt("phone"));
	    return student;
	  }
	}

