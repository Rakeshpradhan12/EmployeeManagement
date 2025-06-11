package com.ems;

import com.ems.controller.EmpController;
import com.ems.dto.EmpDto;

public class app {
    public static void main(String[] args) {
        EmpController empController = new EmpController();
        EmpDto empDto= new EmpDto(101,"madhu",23000.00,"it");
        empController.addEmp(empDto);
    }
}
