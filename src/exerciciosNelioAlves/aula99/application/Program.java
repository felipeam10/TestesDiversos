package exerciciosNelioAlves.aula99.application;

import exerciciosNelioAlves.aula99.entities.Employee;

import javax.lang.model.element.NestingKind;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employee> func = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.printf("Employee #%d:\n", i + 1);
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while (hasId(func, id)) {
                System.out.println("Id already taken! Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine(); //to clear the input buffer
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);
            func.add(emp); //add the element in the list
        }

        System.out.println();
        System.out.printf("Enter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt();
//        Integer pos = position(func, idSalary);

        Employee pos = func.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

        if(pos == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.printf("Enter the percentage: ");
            double percent = sc.nextDouble();
            pos.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee emp : func) {
            System.out.println(emp);
        }


        sc.close();
    }

    public static Integer position(List<Employee> listPosition, int id){
        for (int i = 0; i < listPosition.size(); i++) {
            if(listPosition.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Employee> func, int id) {
        Employee pos = func.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return pos != null;
    }

}
