package exerciciosNelioAlves.secao10_memoria_arrays_listas.aula91;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int number[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            number[i] = sc.nextInt();
        }

//      calculando o valor médio dos números pares do vetor
        int smPar = 0, ctPar = 0; // declara e inicializa as variáveis
        float media = 0;
        for (int i=0; i<n; i++) {
            if ((number[i] % 2) == 0) {             // verifica "se" o i-ésimo item do vetor é par
                ctPar = ctPar + 1;        // conta os elementos pares
                smPar = smPar + number[i];            // soma os elementos pares
            }
        }

        if (ctPar != 0) {// evitando a divisão por zero
            media = (float) smPar / ctPar;
            System.out.printf("MEDIA DOS PARES = " + media);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }

        sc.close();
    }
}
