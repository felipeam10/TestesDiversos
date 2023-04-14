package exerciciosNelioAlves.aula91;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Alturas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // lê o número de pessoas
        System.out.print("Quantas pessoas serão digitadas? ");
        int N = sc.nextInt();

        // inicializa as variáveis de contagem
        double somaAltura = 0;
        int menores16 = 0;
        ArrayList<String> nomesMenores16 = new ArrayList<>();

        // faz um loop para ler os dados de cada pessoa
        for (int i = 1; i <= N; i++) {
            System.out.printf("Dados da %da pessoa:\n", i);
            System.out.printf("Nome: ");
            String nome = sc.next();
            System.out.printf("Idade: ");
            int idade = sc.nextInt();
            System.out.printf("Altura: ");
            double altura = sc.nextDouble();

            // soma a altura da pessoa à soma total
            somaAltura += altura;

            // verifica se a pessoa tem menos de 16 anos e adiciona à lista de nomes, se for o caso
            if (idade < 16) {
                menores16++;
                nomesMenores16.add(nome);
            }
        }

        // calcula a altura média
        double alturaMedia = somaAltura / N;

        // calcula a porcentagem de pessoas com menos de 16 anos
        double porcentagemMenores16 = (double) menores16 / N * 100;

        // mostra os resultados na tela
        System.out.printf("Altura média: %.2f\n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n", porcentagemMenores16);
        if (!nomesMenores16.isEmpty()) {
            for (String nome : nomesMenores16) {
                System.out.println(nome);
            }
        }

        sc.close();
    }
}
