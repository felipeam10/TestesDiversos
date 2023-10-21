package exerciciosNelioAlves.secao10_memoria_arrays_listas.aula91;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int maiorIdade, posicaoMaior;

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        String nomes[] = new String[n];
        int idades[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.printf("Nome: ");
            nomes[i] = sc.next();
            System.out.printf("Idade: ");
            idades[i] = sc.nextInt();
        }

        maiorIdade = idades[0];
        posicaoMaior = 0;

        for (int i = 0; i < n; i++) {
            if (idades[i] > maiorIdade){
                maiorIdade = idades[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s\n", nomes[posicaoMaior]);

        sc.close();
    }
}
