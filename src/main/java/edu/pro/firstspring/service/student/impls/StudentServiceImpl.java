package edu.pro.firstspring.service.student.impls;

import edu.pro.firstspring.dao.student.impls.StudentDAOFakeImpl;
import edu.pro.firstspring.model.Student;
import edu.pro.firstspring.service.student.interfaces.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    StudentDAOFakeImpl dao;

    @Override
    public Student create(Student student) {
        return null;
    }

    @Override
    public Student get(String id) {
        return null;
    }

    @Override
    public Student update(Student student) {
        return null;
    }

    @Override
    public Student delete(String id) {
        return null;
    }

    @Override
    public List<Student> getAll() {
        return dao.getAll();
    }
}
