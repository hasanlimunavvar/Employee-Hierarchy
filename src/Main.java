
import model.Employee;
import model.HourlyEmployee;
import model.SalariedEmployee;
import model.CommissionedEmployee;

public class Main {
    public static void main(String[] args) {
        String hour;
        String name;
        String salary;
        String commission;

        Employee hourlyEmployee = new HourlyEmployee("Leyla",1500, 1);
        printSalaryInfo(hourlyEmployee);
        Employee salariedEmployee = new SalariedEmployee("Ahmed",  1200);
        printSalaryInfo(salariedEmployee);
        Employee commissionedEmployee = new CommissionedEmployee("Selim", 2000, 1);
        printSalaryInfo(commissionedEmployee);
    }

    public static void printSalaryInfo(Employee employee){

        System.out.println(employee.getName()+"--"+employee.calculateSalary());
    }
}