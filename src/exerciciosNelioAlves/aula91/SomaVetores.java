package exerciciosNelioAlves.aula91;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter em cada vetor? ");
        int n = sc.nextInt();

        int vetorA[] = new int[n];
        System.out.printf("Digite os valores do vetor A: \n");
        for (int i = 0; i < n; i++) {
            vetorA[i] = sc.nextInt();
        }

        int vetorB[] = new int[n];
        System.out.printf("Digite os valores do vetor B: \n");
        for (int i = 0; i < n; i++) {
            vetorB[i] = sc.nextInt();
        }

        int vetorC[] = new int[n];
        for (int i = 0; i < n; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }
        System.out.printf("VETOR RESULTANTE: \n");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d\n", vetorC[i]);
        }

        sc.close();
    }
}
