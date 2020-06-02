package edu.pro.firstspring.dao.student.impls;

import edu.pro.firstspring.dao.student.interfaces.IStudentDAO;
import edu.pro.firstspring.dataset.FakeDataSet;
import edu.pro.firstspring.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOFakeImpl implements IStudentDAO {

    @Autowired
    FakeDataSet fakeDataSet;


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
        return fakeDataSet.getStudents();
    }
}
