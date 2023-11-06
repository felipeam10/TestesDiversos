package exerciciosNelioAlves.secao07_outros_topicos_basicos_em_java;

import java.util.Scanner;

public class Aula571 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //89 = false
        //113 = true

        int mask = 0b00100000; // 32
        int n = sc.nextInt();

        if((n & mask) != 0) {
            System.out.println("6th bit is true");
        } else {
            System.out.println("6th bit is false");
        }

    }
}
