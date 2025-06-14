package com.ems.controller;

import com.ems.dao.EmpDaoImpl;
import com.ems.dto.EmpDto;

import java.io.IOException;
import java.sql.SQLException;

public class EmpController {

    //data injection , creating another class object and passing data
    EmpDaoImpl empDao;
    public EmpController() throws IOException {
        this.empDao = EmpDaoImpl.getEmpDaoimpl();

    }
    public void addEmp(EmpDto empDto){
        empDao.addNewEmp(empDto);

    }

    public void deleteEmpById(int id) throws Exception {
        empDao.deleteEmp(id);
    }
    public void updateEmpById(int id , String name) throws SQLException{
        empDao.updateEmp(id,name);
    }

    public void showAllEmp() throws Exception{
        empDao.showAllEmp();
    }


}
