package com.Kapill.DemoEmployeeBoss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeBossController {
    @Autowired
    EmployeeBossService service;
//-------------------------------------------------------------------------------------
    // add employee
    @PostMapping("/employee")
    public void addEmployee(@RequestBody Employee employee) {
        service.addEmployee(employee);
    }
//-------------------------------------------------------------------------------------
    //add Boss
    @PostMapping("/boss")
    public void addBoss(@RequestBody Boss boss) {
        service.addBoss(boss);
    }
//-------------------------------------------------------------------------------------
    //Get Employee who are under a given age and have rating > x
    @GetMapping("/employee/{age}/{rating}")
    public List<Employee> getEmployees(@PathVariable int age, @PathVariable int rating) {
        return service.getEmployees(age, rating);
    }
//-------------------------------------------------------------------------------------
    //Update all boss salary by x , whos rating is > y
    @PutMapping("/boss/{salary}/{rating}")
    public void updateBosses(@PathVariable int salary, @PathVariable int rating) {
        service.updateBosses(salary, rating);
    }
//-------------------------------------------------------------------------------------
    // Find count of all employee who's bossRating and EmployeeRating > x
    @GetMapping("/employeeCount/{rating}")
    public int getEmployeeCount(@PathVariable int rating) {
        return service.getEmployeeCount(rating);
    }
//-------------------------------------------------------------------------------------
}
