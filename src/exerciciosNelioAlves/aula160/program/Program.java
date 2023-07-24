package exerciciosNelioAlves.aula160.program;

import exerciciosNelioAlves.aula160.entities.Account;
import exerciciosNelioAlves.aula160.entities.BusinessAccount;
import exerciciosNelioAlves.aula160.entities.SavingsAccount;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        Account acc = new Account(1001, "Felipe", 1000.0);
//        acc.withdraw(200.0);
//        System.out.println(acc.getBalance());
//
//        Account acc2 = new SavingsAccount(1002, "Lidi", 1000.0, 0.01);
//        acc2.withdraw(200.0);
//        System.out.println(acc2.getBalance());
//
//        Account acc3 = new BusinessAccount(1003, "Ceci", 1000.0, 500.0);
//        acc3.withdraw(200.0);
//        System.out.println(acc3.getBalance());

        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());


        sc.close();
    }
}
