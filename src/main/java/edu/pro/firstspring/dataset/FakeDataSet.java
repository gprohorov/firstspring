package edu.pro.firstspring.dataset;

import edu.pro.firstspring.model.Chair;
import edu.pro.firstspring.model.Student;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class FakeDataSet {

    private List<Chair> chairs = new ArrayList<>(

            Arrays.asList(
                    new Chair("1", "Computer Systems and Networks"),
                    new Chair("2", "Math. problems of Control and Cybernetics"),
                    new Chair("3", "Software Engineering", "The best one")
            )
    );

    private List<Student>  students = new ArrayList<>(
       Arrays.asList(
               new Student("1","Ivan", LocalDate.of(2000,2,21), chairs.get(0)),
               new Student("2","Stepan", LocalDate.of(2000,4,21), chairs.get(1)),
               new Student("3","Petro", LocalDate.of(2000,5,21), chairs.get(2)),
               new Student("4","Sidor", LocalDate.of(2000,6,21), chairs.get(2)),
               new Student("5","Jan", LocalDate.of(2000,7,21), chairs.get(0)),
               new Student("6","Jose", LocalDate.of(2000,8,21), chairs.get(2))
       )

    ) ;






    public List<Chair> getChairs() {
        return chairs;
    }

    public List<Student> getStudents() {
        return students;
    }
}
