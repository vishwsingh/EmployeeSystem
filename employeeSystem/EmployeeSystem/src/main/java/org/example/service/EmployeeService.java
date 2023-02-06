package org.example.service;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.example.model.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee saveEmployee(Employee employee);
    public List<Employee> getAllEmployees();

    public void delete(Integer id);
}
