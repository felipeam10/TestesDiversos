package exemplosDevMedia.exemplos_OLD;

import java.util.Scanner;

public class ArrayEx03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n = 7;             // tamanho do vetor
        int v[] = new int[n];  // declarando e alocando espaço para o vetor "v"
        int i;                 // índice ou subscrito

        // Entrada de Dados
        for (i=0; i<n; i++) {
            System.out.printf("Informe %do. valor de %d: ", (i+1), n);
            v[i] = ler.nextInt();
        }

        // Processamento: definindo o maior e o menor valor
        int menor = v[0]; // v[0] = 1º valor armazenado no vetor "v"
        int maior = v[0];
        for (i=1; i<n; i++) {
            if (v[i] < menor)
                menor = v[i];
            else if (v[i] > maior)
                maior = v[i];
        }

        // Saída (resultados)
        System.out.printf("\n");
        for (i=0; i<n; i++) {
            if (v[i] == menor)
                System.out.printf("v[%d] = %2d <--- menor valor\n", i, v[i]);
            else if (v[i] == maior)
                System.out.printf("v[%d] = %2d <--- maior valor\n", i, v[i]);
            else System.out.printf("v[%d] = %2d\n", i, v[i]);
        }
    }

}
