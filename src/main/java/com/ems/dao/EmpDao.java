package com.ems.dao;

import com.ems.dto.EmpDto;

public interface EmpDao {

    void addNewEmp(EmpDto empDto);
    void deleteEmp(int id);
    void updateEmp(int id,String name);
    void showAllEmp();


}


