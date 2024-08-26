package com.employeemanager.rest.webservices.restfulwebservices.employee;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class EmpService {

    private static List<Emp> employees = new ArrayList<>();

    private static int empCount= 0;

    static {
        employees.add(new Emp(++empCount, "admin1", "John Doe", "john.doe@example.com", "Software Engineer"));
        employees.add(new Emp(++empCount, "admin1", "Jane Smith", "jane.smith@example.com", "Project Manager"));
        employees.add(new Emp(++empCount, "admin2", "Alice Johnson", "alice.johnson@example.com", "DevOps Engineer"));
        employees.add(new Emp(++empCount, "admin1", "Alice ", "alice.johnson@example.com", "DevOps Engineer"));
    }

    public List<Emp> findByUsername(String username) {
        Predicate<? super Emp> predicate = emp -> emp.getUsername().equalsIgnoreCase(username);
        return employees.stream().filter(predicate).toList();
    }

    public Emp addEmployee(String name, String username,String email, String designation) {
        Emp emp = new Emp(++empCount,username, name, email, designation);
        employees.add(emp);
        return emp;
    }

    public void deleteById(int id) {
        Predicate<? super Emp> predicate = emp -> emp.getId() == id;
        employees.removeIf(predicate);
    }

    public Emp findById(int id) {
        Predicate<? super Emp> predicate = emp -> emp.getId() == id;
        return employees.stream().filter(predicate).findFirst().get();
    }

    public void updateEmployee(Emp emp) {
        deleteById(emp.getId());
        employees.add(emp);
    }
}
