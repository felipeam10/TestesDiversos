package exemplosDevMedia.exemplos_OLD;

import java.util.Scanner;

public class Matrizes04 { // calculando o percentual de números positivos da matriz

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
        // calculando o percentual de números positivos da matriz
        int ctPos = 0; // declara e inicializa as variáveis
        double p = 0;
        for (i=0; i<nl; i++) {
            for (j=0; j<nc; j++) {
                if (M[i][j] > 0) {         // verifica "se" o elemento da matriz é positivo
                    ctPos = ctPos + 1;            // contando os elementos positivos
                }
            }
        }

        p = (ctPos * 100.0) / (nl * nc);

        System.out.println("Percentual de números positivos da matriz: " + p);
    }
}
