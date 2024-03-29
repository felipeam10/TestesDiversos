package exerciciosNelioAlves.secao14_heranca_e_polimorfismo.aula161.program;

import exerciciosNelioAlves.secao14_heranca_e_polimorfismo.aula161.entities.Employee;
import exerciciosNelioAlves.secao14_heranca_e_polimorfismo.aula161.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Employee> employees = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            sc.nextLine();

            if (ch == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                employees.add(new Employee(name, hours, valuePerHour));
            }

        }
        System.out.println("\nPAYMENTS:");
        for (Employee employee : employees) {
            double payment = employee.payment();
            System.out.printf("%s - $ %.2f%n", employee.getName(), payment);
        }
        sc.close();
    }
}
