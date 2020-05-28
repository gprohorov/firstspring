package edu.pro.firstspring.service.chair.impls;

import edu.pro.firstspring.dao.chair.impls.ChairDAOFakeImpl;
import edu.pro.firstspring.dao.chair.impls.ChairDAOMongoImpl;
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
    ChairDAOMongoImpl dao;

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

        List<Chair> chairs = dao.getAll();

        return chairs;
    }
}
