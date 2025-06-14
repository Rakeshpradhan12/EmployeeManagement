package com.ems;

import com.ems.controller.EmpController;
import com.ems.dto.EmpDto;

import java.io.IOException;

public class app {
    public static void main(String[] args) throws Exception {
        EmpController empController = new EmpController();
        EmpDto empDto= new EmpDto(102,"Rakesh",53000.00,"sales");
        empController.addEmp(empDto);
        empController.deleteEmpById(102);
        empController.updateEmpById(101,"Rohan");

        EmpController empController1 = new EmpController();
        EmpDto empDto1= new EmpDto(109,"Rakesh",53000.00,"sales");
        empController.addEmp(empDto1);
        empController.deleteEmpById(109);
        EmpController empController2 = new EmpController();
        empController2.showAllEmp();
    }
}
