package exerciciosNelioAlves.aula158.program;

import exerciciosNelioAlves.aula158.entities.Account;
import exerciciosNelioAlves.aula157.entities.SavingAccount;
import exerciciosNelioAlves.aula158.entities.BusinessAccount;
import exerciciosNelioAlves.aula158.entities.SavingsAccount;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account acc = new Account(1001, "Felipe", 1000.0);
        acc.withdraw(200.0);
        System.out.println(acc.getBalance());

        Account acc2 = new SavingsAccount(1002, "Lidi", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Ceci", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());

        sc.close();
    }
}
