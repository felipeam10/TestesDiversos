package exerciciosNelioAlves.aula91;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double menorAltura, maiorAltura, mediaMulheres, totalAlturaMulheres;
        int qtdHomens, qtdMulheres;


        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        double altura[] = new double[n];
        char genero[] = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            altura[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i + 1);
            genero[i] = sc.next().charAt(0);
        }

        menorAltura = altura[0];
        maiorAltura = altura[0];
        for (int i = 0; i < n; i++) {
            if(altura[i] < menorAltura){
                menorAltura = altura[i];
            }
            if(altura[i] > maiorAltura){
                maiorAltura = altura[i];
            }
        }
        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);


        qtdHomens = 0;
        qtdMulheres = 0;
        totalAlturaMulheres = 0;
        for (int i = 0; i < n; i++) {
           if (genero[i] == 'm'){
               qtdHomens++;
           } else {
               qtdMulheres++;
               totalAlturaMulheres = totalAlturaMulheres + altura[i];
           }
        }

        mediaMulheres = totalAlturaMulheres / qtdMulheres;

        System.out.printf("Media das alturas das mulheres = %.2f\n", mediaMulheres);
        System.out.printf("Numero de homens = %d\n", qtdHomens);

        sc.close();
    }
}
