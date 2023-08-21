package exerciciosNelioAlves.secao15_tratamento_de_excecoes.aula171.program;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        method1();

        System.out.println("End of program");

    }

    public static void method1() {
        System.out.println("xxxxx METHOD1 START xxxxx");
        method2();
        System.out.println("xxxxx METHOD1 END xxxxx");

    }

    public static void method2() {
        System.out.println("xxxxx METHOD2 START xxxxx");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            String vect[] = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Input Error");
        }

        sc.close();
        System.out.println("xxxxx METHOD2 END xxxxx");
    }
}
