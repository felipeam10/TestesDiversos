package exerciciosNelioAlves.aula91;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros vc quer digitar? ");
        int n = sc.nextInt();

        double vetor[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        double maior = vetor[0];
        int posicaoMaior = 0;
        for (int i = 0; i < n; i++) {
            if (vetor[i] > maior)
                maior = vetor[i];
                posicaoMaior = i;
        }

        System.out.printf("\nMAIOR VALOR = %.1f\n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posicaoMaior);


        sc.close();
    }
}
