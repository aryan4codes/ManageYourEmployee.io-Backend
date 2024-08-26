package com.employeemanager.rest.webservices.restfulwebservices.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
public class EmpResource {
    @Autowired
    private EmpService empService;

    public EmpResource(EmpService empService) {
        this.empService = empService;
    }

    @GetMapping("/admins/{username}/employees")
    public List<Emp> retrieveEmployees(@PathVariable String username) {
        return empService.findByUsername(username);
    }

    @GetMapping("/admins/{username}/employees/{id}")
    public Emp retrieveEmployee(@PathVariable String username, @PathVariable int id) {
        return empService.findById(id);
    }

    @PostMapping("/admins/{username}/employees")
    public ResponseEntity<Emp> addEmployee(@PathVariable String username, @RequestBody Emp emp) {
        Emp newEmp = empService.addEmployee(emp.getName(), username, emp.getEmail(), emp.getDesignation());
        URI location = URI.create(String.format("/admins/%s/employees/%d", username, newEmp.getId()));
        return ResponseEntity.created(location).body(newEmp);
    }


    @DeleteMapping("/admins/{username}/employees/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable String username, @PathVariable int id) {
        empService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/admins/{username}/employees/{id}")
    public ResponseEntity<Emp> updateEmployee(@PathVariable String username, @PathVariable int id, @RequestBody Emp emp) {
        Emp existingEmp = empService.findById(id);
        if (existingEmp == null) {
            return ResponseEntity.notFound().build();
        }

        emp.setId(id);
        emp.setUsername(username);
        empService.updateEmployee(emp);
        return ResponseEntity.ok(emp);
    }
}
