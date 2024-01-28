package com.sfs.factory;

import com.sfs.dao.EmployeeDao;
import com.sfs.dao.EmployeeDaoImpl;

public class EmployeeDaoFactory {
    private static EmployeeDao employeeDao = null;

    static {
        employeeDao = new EmployeeDaoImpl();
    }

    public static EmployeeDao getEmployeeDao(){
        return employeeDao;
    }
}
