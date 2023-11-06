package exerciciosNelioAlves.secao06_estruturas_repetitivas;

import java.util.Scanner;

public class Aula481 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        while (x != 2002){
            System.out.println("Senha inválida");
            x = sc.nextInt();
        }

        System.out.println("Acesso permitido");

        sc.close();

    }
}
