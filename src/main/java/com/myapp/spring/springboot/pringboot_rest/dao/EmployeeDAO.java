package com.myapp.spring.springboot.pringboot_rest.dao;

import com.myapp.spring.springboot.pringboot_rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

//    public void saveEmployee(Employee employee);
//
//    Employee getEmployee(int id);
//
//    void deleteEmployee(int id);
}