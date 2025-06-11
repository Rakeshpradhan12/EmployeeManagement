package com.ems.controller;

import com.ems.dao.EmpDaoImpl;
import com.ems.dto.EmpDto;

public class EmpController {

    EmpDaoImpl empDao;
    public EmpController(){
        this.empDao = new EmpDaoImpl();
    }
    public void addEmp(EmpDto empDto){
        empDao.addNewEmp(empDto);

    }

    public void deleteEmpById(){
        empDao.deleteEmp();
    }
    public void updateEmpById(){
        empDao.updateEmp();
    }


}
