package com.java.buddies;

import java.util.ArrayList;
import java.util.List;

public class Application {

  public static void main(String[] args) {
    Employee employee1 = new Employee();
    employee1.setId(1);
    employee1.setAge(28);
    employee1.setPosition("Programador");
    employee1.setSalary(9500);

    Employee employee2 = new Employee();
    employee2.setId(2);
    employee2.setAge(15);
    employee2.setPosition("Administrador");
    employee2.setSalary(2500);

    List<Employee> employees = new ArrayList<>();
    employees.add(employee1);
    employees.add(employee2);

    for(Employee currentEmployee: employees) {
      System.out.println(currentEmployee);
      System.out.println("####################");
    }

    for(int i=0; i<10; i++) {
      employee1.progress();
      System.out.println(employee1);
    }
  }
}
