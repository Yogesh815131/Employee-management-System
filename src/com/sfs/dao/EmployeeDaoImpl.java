package com.sfs.dao;

import com.sfs.beans.Employee;
import com.sfs.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.Statement;

public class EmployeeDaoImpl implements EmployeeDao {

    Connection connection = ConnectionFactory.getConnection();
    @Override
    public String add(Employee employee) {
        String status = "";

        try {
            Statement statement = connection.createStatement();
            int rowCount = statement.executeUpdate("insert into emp1 values("+employee.getEno()+",'"+employee.getEname()+",'"+employee.getEsal()+","+employee.getEaddr()+",')");
            if (rowCount == 1){
                status = "SUCCESS";
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return status;
    }
    @Override
    public String update(Employee employee) {
        return null;
    }
    @Override
    public Employee search(int eno) {
        return null;
    }
    @Override
    public String delete(int eno) {
        return null;
    }
}
