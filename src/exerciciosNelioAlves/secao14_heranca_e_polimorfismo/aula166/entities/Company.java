package exerciciosNelioAlves.secao14_heranca_e_polimorfismo.aula166.entities;

public class Company extends TaxPayer{

    private int numberOfEmployees;

    public Company(){}

    public Company(String name, Double anualincome, int numberOfEmployees) {
        super(name, anualincome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        double taxRate;
        if(getNumberOfEmployees() < 10) {
            taxRate = getAnualIncome() * 0.16;
        } else {
            taxRate = getAnualIncome() * 0.14;
        }

        return taxRate;
    }
}
