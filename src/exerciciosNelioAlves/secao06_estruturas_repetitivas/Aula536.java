package exerciciosNelioAlves.secao06_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Aula536 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }

}