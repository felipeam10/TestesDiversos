package exerciciosNelioAlves.secao14_heranca_e_polimorfismo.aula157.entities;

public class SavingAccount extends Account{

    private Double interestRate;

    public SavingAccount(){}

    public SavingAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }
}
