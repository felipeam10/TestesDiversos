package exerciciosNelioAlves.secao10_memoria_arrays_listas.aula91.aula93.application;

import exerciciosNelioAlves.secao10_memoria_arrays_listas.aula91.aula93.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] rents = new Rent[10];

        System.out.printf("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ": " );
            System.out.printf("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.printf("Email: ");
            String email = sc.next();
            System.out.printf("Room: ");
            int roomNumber = sc.nextInt();

            rents[roomNumber] = new Rent(name, email);

        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10; i++) {
            if(rents[i] != null){
                System.out.println(i + ": " + rents[i]);
            }
        }



        sc.close();
    }
}
