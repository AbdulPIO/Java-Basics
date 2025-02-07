package com.programmersio.javabasics.week3day4.treeset;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable {
    private int empId;
    private String empName;
    private String empDept;

    public Employee(int empId, String empName, String empDept) {
        this.empId = empId;
        this.empName = empName;
        this.empDept = empDept;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empDept='" + empDept + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.getEmpId() && Objects.equals(empName, employee.getEmpName()) && Objects.equals(empDept, employee.getEmpDept());
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, empDept);
    }

    @Override
    public int compareTo(Object emp) {
        return getEmpName().compareTo(((Employee)emp).getEmpName());
    }

//    Ascending according to empID
//    @Override
//    public int compareTo(Object o) {
//        return empId-((Employee)o).empId;
//    }

//    Descending according to empID
//    @Override
//    public int compareTo(Object o) {
//        return ((Employee)o).empId-empId;
//    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Abdul", "UI");
        Employee emp2 = new Employee(101, "Abdul", "UI");
        Employee emp3 = new Employee(102, "Vaibhav", "UI");
        Employee emp4 = new Employee(103, "Saksham", "Java");

        Set<Employee> employees = new TreeSet<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
