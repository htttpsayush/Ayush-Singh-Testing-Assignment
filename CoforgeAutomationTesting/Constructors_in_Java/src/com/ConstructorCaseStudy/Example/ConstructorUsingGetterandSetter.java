// Constructor using getter and setter method

package com.ConstructorCaseStudy.Example;

class Employee {

    private int id;
    private String name;
    private float salary;
    private String ssn;

    public Employee(int id, String name, float salary, String ssn) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.ssn = ssn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}

public class ConstructorUsingGetterandSetter {

    public static void main(String[] args) {

        Employee emp = new Employee(
                123,
                "Johny Bravo",
                1234535.556f,
                "6512872"
        );

        System.out.println("Emp ID: " + emp.getId());
        System.out.println("Emp Name: " + emp.getName());
        System.out.println("Emp Salary: " + emp.getSalary());
        System.out.println("Emp SSN: " + emp.getSsn());
    }
}