package com.sfs.controller;

import com.sfs.beans.Employee;
import com.sfs.factory.EmployeeServiceFactory;
import com.sfs.service.EmployeeService;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EmployeeController {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    EmployeeService employeeService = EmployeeServiceFactory.getEmployeeService();
    public void addEmployee(){
        try {
            System.out.print("Enter Employee Number        :");
            int eno = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Enter Employee Name          :");
            String ename = bufferedReader.readLine();
            System.out.println("enter Employee salary      :");
            float esal = Float.parseFloat(bufferedReader.readLine());
            System.out.println("Enter Employee Address     :");
            String eaddr = bufferedReader.readLine();
            Employee employee = new Employee();
            employee.setEno(eno);
            employee.setEname(ename);
            employee.setEsal(esal);
            employee.setEaddr(eaddr);
            String status = employeeService.addEmployee(employee);
            System.out.println("Status    :"+status);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void searchEmployee(){

    }
    public void updateEmployee(){

    }
    public void deleteEmployee(){

    }
}
