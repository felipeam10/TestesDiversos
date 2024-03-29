package exerciciosNelioAlves.secao06_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Aula534 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            double x = sc.nextInt();
            double y = sc.nextInt();

            if(y == 0) {
                System.out.println("divisao impossivel");
            } else {
                double div = x / y;
                System.out.printf("%.1f%n", div);
            }

        }

        sc.close();
    }
}
