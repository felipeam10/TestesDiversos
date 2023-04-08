package exerciciosNelioAlves.aula81.entities;

public class Account {

    private int numberAccount;
    private String nameHolder;
    private double balance;

    public Account(int numberAccount, String nameHolder) {
        this.numberAccount = numberAccount;
        this.nameHolder = nameHolder;
    }

    public Account(int numberAccount, String nameHolder, double initialDeposit) {
        this.numberAccount = numberAccount;
        this.nameHolder = nameHolder;
        deposito(initialDeposit);
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public String getNameHolder() {
        return nameHolder;
    }

    public void setNameHolder(String nameHolder) {
        this.nameHolder = nameHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void deposito(double amount) {
        balance += amount;
    }

    public void saque(double amount) {
        balance -= amount + 5.0;
    }

    @Override
    public String toString() {
        return "Account{" +
                "numberAccount=" + numberAccount +
                ", nameHolder='" + nameHolder + '\'' +
                ", balance=" + String.format("%.2f", balance) +
                '}';
    }
}
