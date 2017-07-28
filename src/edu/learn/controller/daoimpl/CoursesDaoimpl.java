package edu.learn.controller.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import edu.learn.controller.dao.CoursesDao;
//import edu.learn.rest.RestfulWebservices.Dao.SessionUtil;
import edu.learn.controller.model.Courses;
import edu.learn.controller.model.Student;

public class CoursesDaoimpl implements CoursesDao{

	 @Autowired
	  DataSource datasource;
	  @Autowired
	  JdbcTemplate jdbcTemplate;
	@Override
	public List<Courses> getAllCourses() throws Exception {
		 String sql = "select * from courses";
		    List<Courses> courses = jdbcTemplate.query(sql, new CourseMapper());
		    return courses;
		    }

}
class CourseMapper implements RowMapper<Courses> {
	  public Courses mapRow(ResultSet rs, int arg1) throws SQLException {
		  Courses courses = new Courses();
	    courses.setCourse_id(rs.getInt("course_id"));
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


	}

}
