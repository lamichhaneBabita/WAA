package edu.mum.cs.lesson10.service;

import edu.mum.cs.lesson10.domain.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee saveEmployee(Employee e);

    public List<Employee> getAll();


}
