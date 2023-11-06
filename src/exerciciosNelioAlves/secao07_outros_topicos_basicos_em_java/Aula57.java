package exerciciosNelioAlves.secao07_outros_topicos_basicos_em_java;

import java.util.Locale;
import java.util.Scanner;

public class Aula57 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = 89;
        int n2 = 60;

        System.out.println(n1 & n2); // 24
        System.out.println(n1 | n2); // 125
        System.out.println(n1 ^ n2); // 101
    }
}
