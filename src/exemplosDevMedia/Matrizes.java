package exemplosDevMedia;

import java.util.Scanner;

public class Matrizes { //Exibindo todos os elementos da matriz

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        // declarando a matriz "m" de inteiros 2 por 4 (duas linhas por quatro colunas)
        int nl = 2, nc = 2;
        int m[][] = new int[nl][nc];
        int i, j;

        for (i=0; i<nl; i++) {
            System.out.printf("Informe os elementos %da. linha:\n", (i+1));
            for (j=0; j<nc; j++) {
                System.out.printf("m[%d][%d] = ", i, j);
                m[i][j] = ler.nextInt();
            }
            System.out.printf("\n");
        }

        System.out.printf("\n");
        for (i=0; i<nl; i++) {
            System.out.printf("%da. linha: ", (i+1));
            for (j=0; j<nc; j++) {
                System.out.printf("%d ", m[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
