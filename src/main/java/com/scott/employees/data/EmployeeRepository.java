package com.scott.employees.data;

import com.scott.employees.model.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeRepository {

    private List<Employee> employees = new ArrayList<>();

    // getter
    public List<Employee> getEmployees() {
        return employees;
    }

    // setter - add employee
    public Employee addEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }
}
