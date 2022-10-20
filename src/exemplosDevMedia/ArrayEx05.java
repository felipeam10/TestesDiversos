package exemplosDevMedia;

import java.util.Scanner;

public class ArrayEx05 {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int n = 10;             // tamanho do vetor
        int a[] = new int[n];   // declarando e alocando espaço para o vetor "a"
        int i;                  // índice ou subscrito

        for (i=0; i<n; i++) {
            a[i] = (int)Math.round(Math.random() * 100);  // o resultado desta expressão será um número
            // aleatório no intervalo de 0 até 100
        }

        int x;
        System.out.printf("Informe um número inteiro:\n");
        x = ler.nextInt();

        System.out.printf("\nResultado......................................\n");
        int ct = 0;
        for (i=0; i<n; i++) {
            if (a[i] > x) {
                ct = ct + 1;
                System.out.printf("a[%d] = %2d <---- %do. maior\n", i, a[i], ct);
            }
            else System.out.printf("a[%d] = %2d\n", i, a[i]);
        }
        System.out.printf("...............................................\n");
        System.out.printf("Existem %d elementos no vetor maiores do que %2d.\n", ct, x);
    }
}
