package exerciciosNelioAlves.aula91;

import java.util.Locale;
import java.util.Scanner;

public class Numeros_Pares {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int number[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            number[i] = sc.nextInt();
        }

        //Exibindo todos os elementos do vetor
        int qdePares = 0;
        System.out.println("\n\nNUMEROS PARES: ");
        for (int i=0; i<n; i++) {
            if(number[i] % 2 == 0) {
                System.out.printf("%2d  ", number[i]);
                qdePares++;
            }
        }

        System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qdePares);

        sc.close();
    }
}
