package edu.pro.firstspring.service.chair.impls;

import edu.pro.firstspring.dao.chair.impls.ChairDAOFakeImpl;
import edu.pro.firstspring.model.Chair;
import edu.pro.firstspring.service.chair.interfaces.IChairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ChairServiceImpl implements IChairService {

    @Autowired
    ChairDAOFakeImpl dao;

    @Override
    public Chair create(Chair chair) {
        return dao.create(chair);
    }

    @Override
    public Chair get(String id) {
        return dao.get(id);
    }

    @Override
    public Chair update(Chair chair) {
        return dao.update(chair);
    }

    @Override
    public Chair delete(String id) {
        return dao.delete(id);
    }

    @Override
    public List<Chair> getAll() {

        List<Chair> chairs = dao.getAll();

        return chairs;
    }
}
