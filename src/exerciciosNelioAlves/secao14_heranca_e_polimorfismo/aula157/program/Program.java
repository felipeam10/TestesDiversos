package exerciciosNelioAlves.secao14_heranca_e_polimorfismo.aula157.program;

import exerciciosNelioAlves.secao14_heranca_e_polimorfismo.aula157.entities.Account;
import exerciciosNelioAlves.secao14_heranca_e_polimorfismo.aula157.entities.BusinessAccount;
import exerciciosNelioAlves.secao14_heranca_e_polimorfismo.aula157.entities.SavingAccount;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account acc = new Account(1001, "Felipe", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Lidiane", 0.0, 500.0);


        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Cecilia", 0.0, 200.0);
        Account acc3 = new SavingAccount(1004, "Regina", 0.0, 0.01);

        // DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount) acc3; --> acc3 é do tipo SavingAccount
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingAccount) {
            SavingAccount acc5 = (SavingAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        sc.close();
    }
}
