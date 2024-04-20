package model;

public abstract class Employee {
    public String name;
    public float salary;


    public abstract float calculateSalary ();

    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }
}

