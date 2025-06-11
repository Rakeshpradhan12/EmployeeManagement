package com.ems.dto;

public class EmpDto {
    private int empId;
    private String empName;
    private double empSalary;
    private String empDept;

    public EmpDto(int empId,String empName, double empSalary, String empDept){
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empDept = empDept;
    }


    public void setEmpId(int empId) {
        this.empId = empId;
    }
        public int getEmpId(){
        return empId;
    }


    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getEmpName(){
        return empName;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }
    public double getEmpSalary(){
        return empSalary;
    }


    public void setEmpDept(String empDept) {
        this.empDept= empDept;
    }
    public String getEmpDept(){
        return empDept;
    }

}
