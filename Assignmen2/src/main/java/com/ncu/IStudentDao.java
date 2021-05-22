package com.ncu;

import java.util.List;
import java.util.Map;

public interface IStudentDao {
	
	public int saveStudent(Student e);
	public int updateStudent(Student e);
	public int deleteStudent(Student e);
	public List<Map<String, Object>> getStudent();
}
