package model;

public class SalariedEmployee extends Employee {
    private float salary;
    public SalariedEmployee(String name, float salary) {
        super(name, salary);
    }

    @Override
    public float calculateSalary() {
        return getSalary();

    }
}