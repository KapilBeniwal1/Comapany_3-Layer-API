package com.Kapill.DemoEmployeeBoss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeBossService {
    @Autowired
    EmployeeBossRepository repository;

    public void addEmployee(Employee employee) {
        repository.addEmployee(employee);
    }

    public void addBoss(Boss boss) {
        repository.addBoss(boss);
    }


    public List<Employee> getEmployees(int age, int rating) {
        return repository.getEmployees(age, rating);
    }

    public void updateBosses(int salary, int rating) {
        repository.updateBosses(salary, rating);
    }

    public int getEmployeeCount(int rating ) {
        return repository.getEmployeeCount(rating);
    }
}
