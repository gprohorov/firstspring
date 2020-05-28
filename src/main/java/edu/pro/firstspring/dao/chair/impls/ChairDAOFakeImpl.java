package edu.pro.firstspring.dao.chair.impls;

import edu.pro.firstspring.dao.chair.interfaces.IChairDAO;
import edu.pro.firstspring.dataset.FakeDataSet;
import edu.pro.firstspring.model.Chair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ChairDAOFakeImpl implements IChairDAO {

   @Autowired
   FakeDataSet dataSet;

    @Override
    public Chair create(Chair chair) {
        return null;
    }

    @Override
    public Chair get(String id) {
        return null;
    }

    @Override
    public Chair update(Chair chair) {
        return null;
    }

    @Override
    public Chair delete(String id) {
        return null;
    }




    @Override
    public List<Chair> getAll() {
        //  hard
        return dataSet.getChairs();
    }
}
