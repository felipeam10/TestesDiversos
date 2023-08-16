package exerciciosNelioAlves.secao14_heranca_e_polimorfismo.aula166.entities;

public class Individual extends TaxPayer {

    private Double healthExpenditures; /*gastos com saude*/

    public Individual(){}

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        double baseTax;
        if (getAnualIncome() < 20000 ) {
            baseTax = getAnualIncome() * 0.15;
        } else {
            baseTax = getAnualIncome() * 0.25;
        }
    double healthDeduction = healthExpenditures * 0.5;
    return baseTax - healthDeduction;
    }
}
