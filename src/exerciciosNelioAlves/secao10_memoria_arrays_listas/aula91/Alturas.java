package exerciciosNelioAlves.secao10_memoria_arrays_listas.aula91;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // lê o número de pessoas
        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        // inicializa as variáveis de contagem
        String nome[] = new String[n];
        int idade[] = new int[n];
        double alturas[] = new double[n];

        // faz um loop para ler os dados de cada pessoa
        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i+1);
            System.out.printf("Nome: ");
            nome[i] = sc.next();
            System.out.printf("Idade: ");
            idade[i] = sc.nextInt();
            System.out.printf("Altura: ");
            alturas[i] = sc.nextDouble();

        }

        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma = soma + alturas[i];
        }
        double mediaAlturas = soma / n;
        System.out.printf("Altura media: %.2f\n", mediaAlturas);

        int contagem16anos = 0;
        for (int i = 0; i < n; i++) {
            if(idade[i] < 16)
            contagem16anos++;
        }

        double percent16 = contagem16anos * 100 / n;

        System.out.printf("Pessoas com menos de 16 anos:  %.1f%%\n", percent16);

        for (int i = 0; i < n; i++) {
            if(idade[i] < 16)
                System.out.println(nome[i]);
        }
        sc.close();
    }
}
