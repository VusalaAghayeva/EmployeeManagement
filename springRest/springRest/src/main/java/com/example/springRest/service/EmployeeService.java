package com.example.springRest.service;

import com.example.springRest.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

     List<Employee> findAllEmployee();
     Optional<Employee> findById(Long id);
     Employee saveEmployee(Employee employee);
     Employee updateEmployee(Employee employee);
     void deleteEmployee(Long id);

}
