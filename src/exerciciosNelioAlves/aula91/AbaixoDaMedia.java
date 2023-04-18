package exerciciosNelioAlves.aula91;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double soma, media;

        double vetor[] = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vetor[i];
        }

        media = soma / n;

        System.out.printf("\nMEDIA DO VETOR = %.3f\n", media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

        int i = 0;
        if (vetor[i] >= media) {
            System.out.println("     NAO TEMOS ELEMENTO ABAIXO DA MEDIA");
        } else {
            for (i = 0; i < n; i++) {
                if(vetor[i] < media) {
                    System.out.printf("%.1f\n", vetor[i]);
                }
            }

        }



        sc.close();
    }
}
