package exemplosDevMedia;

import java.util.Scanner;

public class ArrayEx04 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int n = 4; // tamanho do vetor
        int a[] = new int[n]; // declarando e alocando espaço para o vetor "a"
        int i; // índice ou subscrito

        for (i=0; i<n; i++) {
            System.out.printf("Informe %do. valor de %d: ", (i+1), n);
            a[i] = ler.nextInt();
        }

        System.out.printf("\n");
//------------------------------------------------------------------
//        // somando "todos" os elementos do vetor
//        int sm = 0; // declaração e inicialização do somatório
//        for (i=0; i<n; i++) {
//            sm = sm + a[i];
//        }
//        System.out.println(sm);
//------------------------------------------------------------------
//        // contando os elementos do vetor menores que 10
//        int ct = 0; // declaração e inicialização do contador
//        for (i=0; i<n; i++) {
//            if (a[i] < 10)
//                ct = ct + 1;
//        }
//        System.out.println(ct);
//------------------------------------------------------------------
//        // calculando o valor médio dos números pares do vetor
//        int smPar = 0, ctPar = 0; // declara e inicializa as variáveis
//        float media = 0;
//        for (i=0; i<n; i++) {
//            if ((a[i] % 2) == 0) {             // verifica "se" o i-ésimo item do vetor é par
//                ctPar = ctPar + 1;        // conta os elementos pares
//                smPar = smPar + a[i];            // soma os elementos pares
//            }
//        }
//
//        if (ctPar != 0) // evitando a divisão por zero
//            media = (float)smPar / ctPar;
//        System.out.println(media);
//------------------------------------------------------------------
//
//        // calculando o percentual de números pares do vetor
//        int ctPar = 0; // declara e inicializa as variáveis
//        float p = 0;
//        for (i=0; i<n; i++) {
//            if ((a[i] % 2) == 0)         // verifica "se" o i-ésimo item do vetor é par
//                ctPar = ctPar + 1;        // conta os elementos pares
//        }
//
//        p = (float) ((ctPar * 100.0) / n);
//        System.out.println(p);
//------------------------------------------------------------------
        //Exibindo todos os elementos do vetor
        for (i=0; i<n; i++) {
            System.out.printf("a[%d] = %2d\n", i, a[i]);
        }
    }
}
