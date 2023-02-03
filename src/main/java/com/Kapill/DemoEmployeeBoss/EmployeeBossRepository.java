package com.Kapill.DemoEmployeeBoss;
import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeBossRepository {

    private List<Employee> employees = new ArrayList<>(); //as a database for employee
    private List<Boss> bosses = new ArrayList<>(); //as a database for employee

//-------------------------------------------------------------------------------------
    // add employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
//-------------------------------------------------------------------------------------
    // add boss
    public void addBoss(Boss boss) {
        bosses.add(boss);
    }
//-------------------------------------------------------------------------------------
    //Get Employee who are under a given age and have rating > x
    public List<Employee> getEmployees(int age, int rating) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge() < age && employee.getRating() > rating) {
                result.add(employee);
            }
        }
        return result;
    }
//-------------------------------------------------------------------------------------
    //Update all boss salary by x , whos rating is > y
    public void updateBosses(int salary, int rating) {
        for (Boss boss : bosses) {
            if (boss.getRating() > rating) {
                boss.setSalary(boss.getSalary() + salary);
            }
        }
    }
//-------------------------------------------------------------------------------------
    // Find count of all employee who's bossRating and EmployeeRating > x
    public int getEmployeeCount(int rating) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee.getRating() > rating && employee.getBoss().getRating() > rating) {
                count++;
            }
        }
        return count;
    }
//-------------------------------------------------------------------------------------
}
