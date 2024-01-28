package com.sfs.service;

import com.sfs.beans.Employee;
import com.sfs.dao.EmployeeDao;
import com.sfs.factory.EmployeeDaoFactory;

public class EmployeeServiceImpl implements  EmployeeService{
    EmployeeDao employeeDao = EmployeeDaoFactory.getEmployeeDao();
    @Override
    public String addEmployee(Employee employee) {
        String status = employeeDao.add(employee);
        return status;
    }

    @Override
    public Employee searchEmployee(int id) {
        return null;
    }

    @Override
    public String updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public String deleteEmployee(int eno) {
        return null;
    }
}
