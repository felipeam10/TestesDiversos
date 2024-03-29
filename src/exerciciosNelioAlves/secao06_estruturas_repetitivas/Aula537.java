package exerciciosNelioAlves.secao06_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Aula537 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            int primeiro = i;
            int segundo = i*i;
            int terceiro = i*i*i;
            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
        }

        sc.close();
    }
}
