package exerciciosNelioAlves.aula91;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros vc quer digitar? ");
        int n = sc.nextInt();

        int vetor[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("Numeros negativos: ");

        for (int i = 0; i < n; i++) {
            if(vetor[i] < 0){
                System.out.printf("%d\n", vetor[i]);
            }
        }


        sc.close();
    }
}
