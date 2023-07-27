package exerciciosNelioAlves.aula161.entities;

public class OutsourcedEmployee extends Employee {

    private double aditionalCharge;

    public OutsourcedEmployee(){}

    public OutsourcedEmployee(String name, double hours, double hourlyRate, double aditionalCharge) {
        super(name, hours, hourlyRate);
        this.aditionalCharge = aditionalCharge;
    }

    public double getAditionalCharge() {
        return aditionalCharge;
    }

    public void setAditionalCharge(double aditionalCharge) {
        this.aditionalCharge = aditionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + aditionalCharge * 1.1;
    }
}
