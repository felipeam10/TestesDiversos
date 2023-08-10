package exemplosDevMedia.exemplos_OLD;

import java.util.Scanner;

public class Matrizes01 { // contando os elementos da matriz iguais a 0 (zero)

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int nl = 3, nc = 3; // dimensão da matriz: nl- número de linhas e nc- número de colunas
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
        // contando os elementos da matriz iguais a 0 (zero)
        int ct = 0; // declaração e inicialização do contador
        for (i=0; i<nl; i++) {
            for (j=0; j<nc; j++) {
                if (M[i][j] == 0) {  // verifica "se" o elemento da matriz é igual a zero
                    ct = ct + 1; // contando os elementos iguais a zero
                }
            }
        }
        System.out.println("Qte de elementos da matriz iguais a 0 (zero): " + ct);
    }
}
