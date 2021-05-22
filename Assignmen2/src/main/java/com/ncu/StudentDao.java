package com.ncu;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;  

public class StudentDao implements IStudentDao{  
private JdbcTemplate jdbcTemplate;  
  
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
    this.jdbcTemplate = jdbcTemplate;  
}  
  
public int saveStudent(Student e){  
    String query="insert into student values(" + e.getId() +",'"+ e.getName() +"','"+e.getDept_name() +"',"+e.getTot_cred()+")";  
    return jdbcTemplate.update(query);  
}  

public int updateStudent(Student e){
	String query="UPDATE student Set Name=\"ABC\" where name = \"Harshit\"";
	return jdbcTemplate.update(query);  

}  

public int deleteStudent(Student e){
	String query = "Delete from Student Where Name=\"Harshit\"";
	return jdbcTemplate.update(query);
}  

public List<Map<String, Object>> getStudent() {
	String query = "SELECT * FROM Student";
  //  return (Student) jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper(Student.class));
    
	 return jdbcTemplate.queryForList("SELECT id,name,dept_name,tot_cred FROM student");
    
}
  
}