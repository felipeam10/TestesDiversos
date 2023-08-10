package exemplosDevMedia.exemplos_OLD;

public class Matrizes09 {
    public static void main(String[] args) {
        int m1[][] = { {1, 2, 3}, {4, 5} };
        int m2[][] = { {1, 2}, {3}, {4, 5, 6, 7, 8, 9} };

        mostrarMatriz("1a. Matriz", m1);
        System.out.printf("\n\n");
        mostrarMatriz("2a. Matriz", m2);
    }

    public static void mostrarMatriz(String s, int m[][]) {
        int i, j, nl, nc;

        System.out.printf("%s\n", s);
        System.out.printf("----------------\n");

        nl = m.length; // determina o número de linhas da matriz

        for (i=0; i<nl; i++) {
            System.out.printf("%da. linha: ", (i+1));

            nc = m[i].length; // determina o número de colunas da i-ésima linha

            for (j=0; j<nc; j++) {
                System.out.printf("%d ", m[i][j]);
            }
            System.out.printf("\n");
        }
    }

}
