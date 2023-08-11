package exerciciosNelioAlves.secao14_heranca_e_polimorfismo.aula161.entities;

public class Employee {

    private String name;
    private double hours;
    private double valuePerHour;
//    private double additionalExpense;
//    private boolean isOutsourced;

    public Employee(){}

    public Employee(String name, double hours, double hourlyRate) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = hourlyRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public double payment() {
        return hours * valuePerHour;
    }
}
