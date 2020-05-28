package edu.pro.firstspring.service.chair.interfaces;

import edu.pro.firstspring.model.Chair;

import java.util.List;

public interface IChairService {
    //  CRUD
    Chair create(Chair chair);
    Chair get(String id);
    Chair update(Chair chair);
    Chair delete(String id);
    List<Chair> getAll();

}
