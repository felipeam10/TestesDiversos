package exemplosDevMedia;

import java.util.Scanner;

public class Listagem06 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // declarando e inicializando o vetor "estadoCivil"
        String estadoCivil[] = {"Solteiro", "Casado", "Separado", "Divorciado", "Viúvo"};
        int i;                      // índice ou subscrito
        int n = estadoCivil.length; // tamanho do vetor

        System.out.printf("Código   Estado Civil\n");
        System.out.printf("---------------------\n");
        for (i=0; i<n; i++) {
            System.out.printf("%6d   %s\n", i, estadoCivil[i]);
        }
        System.out.printf("---------------------\n\n");

        System.out.printf("Informe o código do seu estado civil:\n");
        i = ler.nextInt();

        System.out.printf("\nResultado: ");
        if ((i >= 0) && (i < n))
            System.out.printf("%d = %s.\n", i, estadoCivil[i]);
        else System.out.printf("Erro, %d = código inválido.\n", i);
    }
}
