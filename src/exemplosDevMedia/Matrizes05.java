package exemplosDevMedia;

import java.util.Scanner;

public class Matrizes05 { // soma de todos elementos da matriz

    public static void main(String[] args) {
        int n = 3;
        int M[][] = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int i, j;

        // declarando os somatórios
        int smLinha, smTodos = 0;

        for (i=0; i<n; i++) {
            System.out.printf("%da. linha:", (i+1));
            // definindo a soma dos elementos da i-ésima linha
            smLinha = 0;
            for (j=0; j<n; j++) {
                System.out.printf(" %d", M[i][j]);

                // somando o elemento da i-ésima linha, j-ésima coluna
                smLinha = smLinha + M[i][j];
            }
            System.out.printf(", soma = %d\n", smLinha);

            // definindo a soma de todos elementos da matriz
            smTodos = smTodos + smLinha;
        }
        System.out.printf("\nSoma Total = %d\n", smTodos);
    }
}
