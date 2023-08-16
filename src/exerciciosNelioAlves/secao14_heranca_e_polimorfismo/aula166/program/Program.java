package exerciciosNelioAlves.secao14_heranca_e_polimorfismo.aula166.program;

import exerciciosNelioAlves.secao14_heranca_e_polimorfismo.aula166.entities.Company;
import exerciciosNelioAlves.secao14_heranca_e_polimorfismo.aula166.entities.Individual;
import exerciciosNelioAlves.secao14_heranca_e_polimorfismo.aula166.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + "data:");
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            Double income = sc.nextDouble();

            if(type == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                sc.nextLine();
                list.add(new Individual(name, income, healthExpenditures));
            } else if (type == 'c') {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                sc.nextLine();
                list.add(new Company(name, income, numberOfEmployees));
            }

        }

        System.out.println();
        System.out.println("TAXES PAID:");
        double totalTaxes = 0;

        for (TaxPayer taxPayer : list) {
            double tax = taxPayer.tax();
            totalTaxes += tax;
            System.out.println(taxPayer.getName() + ": $" + String.format("%.2f", tax));
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $" + String.format("%.2f", totalTaxes));

        sc.close();
    }
}
