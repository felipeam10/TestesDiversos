package exerciciosNelioAlves.secao04_estrutura_sequencial;

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;

public class Aula23 {
    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "OfficeDesk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println(

                "Products:\n"
                + product1 + ", which price is $ " + price1 + "\n"
                + product2 + ", which price is $ " + price2 + "\n");

        System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender + "\n");

        System.out.printf("Measue with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);

    }
}
