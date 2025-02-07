package com.programmersio.javabasics.week3day4.treeset;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Employee1 {
    private int empId;
    private String empName;
    private String empDept;

    public Employee1(int empId, String empName, String empDept) {
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
        Employee1 employee = (Employee1) o;
        return empId == employee.empId && Objects.equals(empName, employee.empName) && Objects.equals(empDept, employee.empDept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, empDept);
    }
}

class NameComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((Employee1)o1).getEmpName().compareTo(((Employee1)o2).getEmpName());
    }
}

class EmpIdComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        return Integer.compare(((Employee1)o1).getEmpId(),((Employee1)o2).getEmpId());
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        Employee1 emp1 = new Employee1(101, "Abdul", "UI");
        Employee1 emp2 = new Employee1(101, "Abdul", "UI");
        Employee1 emp3 = new Employee1(102, "Vaibhav", "UI");
        Employee1 emp4 = new Employee1(103, "Saksham", "Java");

        Set<Employee1> employees = new TreeSet<>(new EmpIdComparator());
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        for (Employee1 emp : employees) {
            System.out.println(emp);
        }
    }
}
