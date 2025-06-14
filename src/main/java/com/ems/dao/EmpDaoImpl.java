package com.ems.dao;

import com.ems.config.DBConnection;
import com.ems.dto.EmpDto;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpDaoImpl implements EmpDao{


    private Connection connection;
    //singleton pattern
    private static EmpDaoImpl empDaoimpl ;


     private EmpDaoImpl() throws IOException{
         this.connection = DBConnection.getDBConnection();
         System.out.println("object create only once");
     }
     public static EmpDaoImpl getEmpDaoimpl() throws IOException{
         if(empDaoimpl == null){
             empDaoimpl = new EmpDaoImpl();
         }
         return empDaoimpl;
     }






   //query to insert data in db
    @Override
    public void addNewEmp(EmpDto empDto) {
       String sql = "insert into employees (id,name,salary,department)values (?,?,?,?)";
       try{
           PreparedStatement ps = connection.prepareStatement(sql);
           ps.setInt(1,empDto.getEmpId());
           ps.setString(2,empDto.getEmpName());
           ps.setDouble(3,empDto.getEmpSalary());
           ps.setString(4, empDto.getEmpDept());
           ps.executeUpdate();
           System.out.println("data inserted ....");
       }
       catch (Exception e){
           e.printStackTrace();
       }
    }

    @Override
    public void deleteEmp(int id) {
       String sql = "delete from employees where id = ? ";
       try{
           PreparedStatement ps = connection.prepareStatement(sql);
           ps.setInt(1,id);
           ps.executeUpdate();
           System.out.println("deleted successfully");
       }
       catch(SQLException s){
           s.printStackTrace();
       }


    }

    @Override
    public void updateEmp(int id,String name) {
        String sql = "update employees set name = ? where id = ?";
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(2,id);
            ps.setString(1,name);
            ps.executeUpdate();
            System.out.println("data updated successfully...");
        }
        catch(SQLException s){
            s.printStackTrace();
        }


    }

    @Override
    public void showAllEmp() {
        String sql = "select * from employees";
        List<EmpDto> empDtos = new ArrayList<>();
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            // for select statement
            ResultSet rs =ps.executeQuery();
            System.out.println(rs.toString());
            while(rs.next()){
               EmpDto empDto = new EmpDto(rs.getInt("id"),rs.getString("name"),rs.getDouble("salary"),rs.getString("department"));
                empDtos.add(empDto);
            }
            for(EmpDto ed : empDtos){
                System.out.println("Id : "+ ed.getEmpId()+" Name : "+ed.getEmpName()+" Salary : "+ed.getEmpSalary()+" department : "+ ed.getEmpDept());
            }



        }
        catch(Exception e){
            e.printStackTrace();
        }



    }


}
