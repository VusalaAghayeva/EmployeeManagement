package com.example.springRest.controller;

import com.example.springRest.model.Employee;
import com.example.springRest.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping
    public List<Employee> findAllEmploye(){
        return employeeService.findAllEmployee();
    }
    @GetMapping("/{id}")
    public Optional<Employee> findEmployeeById(@PathVariable("id") Long id){
        return employeeService.findById(id);

    }
    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee){
        return  employeeService.saveEmployee(employee);
    }
    @PutMapping
    public Employee updateEmployee(@RequestBody Employee employee){
        return  employeeService.updateEmployee(employee);
    }
    @DeleteMapping("/{id}")
    public  void deleteEmployee(@PathVariable("id") Long id){
        employeeService.deleteEmployee(id);
    }
}
