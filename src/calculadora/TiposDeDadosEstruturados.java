package calculadora;

public class TiposDeDadosEstruturados {

    public static void main(String[] args) {
        int n = 5;                          // tamanho do vetor
        int nota[] = {100, 70, 90, 85, 80}; // declarando e alimentando o vetor
        int i;                              // índice ou subscrito

        // percorrendo todos os valores armazenados no vetor
        int soma = 0;
        for (i=0; i<n; i++) {
            System.out.printf("nota[%d] = %d\n", i, nota[i]);
            soma = soma + nota[i];
        }

        double media = soma / (double)n;
        System.out.printf("\nMédia Aritmética Simples = %.2f\n", media);
    }
}
