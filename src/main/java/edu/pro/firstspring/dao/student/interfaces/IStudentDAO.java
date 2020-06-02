package edu.pro.firstspring.dao.student.interfaces;

import edu.pro.firstspring.model.Student;

import java.util.List;

public interface IStudentDAO {

    Student create(Student student);
    Student get(String id);
    Student update(Student student);
    Student delete(String id);
    List<Student> getAll();


}
