package model;

public class HourlyEmployee extends Employee{
    private int hour;


    public HourlyEmployee(String name, float salary, int hour) {
        super(name, salary);
        this.hour = hour;
    }
        public int getHour(){
            return this.hour;

    }

    @Override
    public float calculateSalary() {
        float hourlysalary =getSalary()/getHour();


        return hourlysalary;
    }
}
