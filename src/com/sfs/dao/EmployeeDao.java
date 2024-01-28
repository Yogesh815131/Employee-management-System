package com.sfs.dao;

import com.sfs.beans.Employee;

public interface EmployeeDao {
    public String add(Employee employee);
    public String update(Employee employee);
    public Employee search(int eno);
    public String delete(int eno);
}
