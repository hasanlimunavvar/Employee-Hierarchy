package model;

public class CommissionedEmployee extends Employee {
    private int comission;

    public CommissionedEmployee (String name, float salary, int comission) {
        super(name, salary);
        this.comission = comission;
    }
public int getComission(){
        return this.comission;
}
    @Override
    public float calculateSalary(){
        float commissionedSalary= getSalary()+(getSalary()*this.comission)/100;
        return commissionedSalary;
    }

}