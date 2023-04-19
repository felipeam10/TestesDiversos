package exerciciosNelioAlves.aula91;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double media;

        System.out.print("Quantos alunos serão digitadas? ");
        int n = sc.nextInt();

        String nome[] = new String[n];
        double nota1[] = new double[n];
        double nota2[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o nome, primeira e segunda nota do %da aluno:\n", i + 1);
            nome[i] = sc.next();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados: ");

        for (int i = 0; i < n; i++) {
            media = (nota1[i] + nota2[i]) / 2;

            if(media >= 6.0){
                System.out.printf("%s\n", nome[i]);
            }
        }





        sc.close();
    }
}
