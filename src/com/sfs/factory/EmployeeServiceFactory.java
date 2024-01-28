package com.sfs.factory;

import com.sfs.service.EmployeeService;
import com.sfs.service.EmployeeServiceImpl;

public class EmployeeServiceFactory {
    private static EmployeeService employeeService;

    static {
        employeeService = new EmployeeServiceImpl();
    }

    public static EmployeeService getEmployeeService() {
        return employeeService;
    }
}
