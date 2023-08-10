package exemplosDevMedia.exemplos_OLD;

public class Matrizes06 {

    public static void main(String[] args) { // matriz quadrada
        int n = 6;
        int M[][] = new int[n][n];
        int i, j;

        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                if (i == j) // diagonal principal
                    M[i][j] = 0;
                else if ((i+j) == (n-1)) // diagonal secundária
                    M[i][j] = 1;
                    // sorteia um número aleatório no intervalo de 2 até 5
                else M[i][j] = (int)(Math.round(Math.random() * 2) + 3);
            }
        }

        for (i=0; i<n; i++) {
            System.out.printf("%da. linha: ", (i+1));
            for (j=0; j<n; j++) {
                System.out.printf("%d ", M[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
