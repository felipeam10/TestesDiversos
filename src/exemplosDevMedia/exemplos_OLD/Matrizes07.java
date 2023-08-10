package exemplosDevMedia.exemplos_OLD;

public class Matrizes07 {

    public static void main(String[] args) {
        int n = 5;
        int M[][] = new int[n][n];
        int i, j;

        // alimentando e mostrando os elementos da matriz
        for (i=0; i<n; i++) {
            System.out.printf("%da. linha: ", (i+1));
            for (j=0; j<n; j++) {
                // sorteia um número aleatório no intervalo de 0 até 100
                M[i][j] = (int)Math.round(Math.random() * 100);

                System.out.printf("%3d ", M[i][j]);
            }
            System.out.printf("\n");
        }

        // localizando a posição (linha e coluna) do menor e do maior valor
        int linMenor = 0, colMenor = 0;
        int linMaior = 0, colMaior = 0;

        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                // definindo a posição do menor valor
                if (M[i][j] < M[linMenor][colMenor]) {
                    linMenor = i;
                    colMenor = j;
                }
                else
                    // definindo a posição do maior valor
                    if (M[i][j] > M[linMaior][colMaior]) {
                        linMaior = i;
                        colMaior = j;
                    }
            }
        }

        System.out.printf("\nMenor valor = %3d (%da. linha, %da. coluna)",
                M[linMenor][colMenor], (linMenor+1), (colMenor+1));

        System.out.printf("\nMaior valor = %3d (%da. linha, %da. coluna)\n",
                M[linMaior][colMaior], (linMaior+1), (colMaior+1));
    }
}
