package exemplosDevMedia;

import java.util.Scanner;

public class Matrizes02 { // somando "todos" os elementos da matriz

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int nl = 2, nc = 2; // dimensão da matriz: nl- número de linhas e nc- número de colunas
        int M[][] = new int[nl][nc]; // declarando e alocando espaço para a matriz "M"
        int i; // Índices ou subscritos:
        int j; // i- índice da linha e j- índice da coluna

        for (i=0; i<nl; i++) {
            System.out.printf("Informe os elementos %da. linha:\n", (i+1));
            for (j=0; j<nc; j++) {
                System.out.printf("m[%d][%d] = ", i, j);
                M[i][j] = ler.nextInt();
            }
            System.out.printf("\n");
        }

        System.out.printf("\n");
        // somando "todos" os elementos da matriz
        int sm = 0; // declaração e inicialização do somatório
        for (i=0; i<nl; i++) {
            for (j=0; j<nc; j++) {
                sm = sm + M[i][j];  // somando os elementos
            }
        }
        System.out.println("Soma de elementos da matriz: " + sm);
    }
}
