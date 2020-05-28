package edu.pro.firstspring.dataset;

import edu.pro.firstspring.model.Chair;
import org.springframework.stereotype.Repository;

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


    public List<Chair> getChairs() {
        return chairs;
    }







}
