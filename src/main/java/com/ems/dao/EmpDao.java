package com.ems.dao;

import com.ems.dto.EmpDto;

public interface EmpDao {

    void addNewEmp(EmpDto empDto);
    void deleteEmp();
    void updateEmp();
    void showAllEmp();


}


