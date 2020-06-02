package edu.pro.firstspring.dao.chair.impls;

import edu.pro.firstspring.dao.chair.interfaces.IChairDAO;
import edu.pro.firstspring.dataset.FakeDataSet;
import edu.pro.firstspring.model.Chair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ChairDAOFakeImpl implements IChairDAO {
/*
*     Stupid Fake Implementation
*
* */
   @Autowired
   FakeDataSet dataSet;

    @Override
    public Chair create(Chair chair) {

        List<Integer> list = this.getAll().stream()
                .map(el -> Integer.valueOf(el.getId()))
                .collect(Collectors.toList());

        Integer max = list.stream().max(Comparator.naturalOrder()).orElse(0);

        String id =  String.valueOf(max +1);

        if (chair.getId() == null) chair.setId(id);

        this.getAll().add(chair);
        return chair;
    }

    @Override
    public Chair get(String id) {
        return this.getAll().stream()
                .filter(el -> el.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public Chair update(Chair chair) {
        String id = chair.getId();
        int index = this.getAll().indexOf(chair);
        this.delete(id);
        this.getAll().add(index, chair);

        return chair;
    }

    @Override
    public Chair delete(String id) {

        Chair chairToDelete = this.get(id);

       this.getAll().remove(chairToDelete);

        return chairToDelete;
    }

    @Override
    public List<Chair> getAll() {

        return dataSet.getChairs();
    }
}
