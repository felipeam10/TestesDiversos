package exemplosDevMedia.date_array_e_string.topico04_7;

public class Igualdade06 {

    public static void main(String[] args) {

        String nome1 = "Carlos";
        String nome2 = "Carla";

        System.out.println("nome2.compareTo(nome1) = "+nome2.compareTo(nome1));
        System.out.println("nome1.compareTo(nome2) = "+nome1.compareTo(nome2));
    }
}

/* compareTo
Esse método pode retornar 0 se as strings forem iguais, um número negativo se a string que invoca o compareTo for menor que a string que é passada como um argumento e um número positivo se a string que invoca o compareTo for maior que a string que é passada como argumento. */

/*
* O resultado é -1, pois o compareTo da string que invoca o compareTo para a string que é passada como argumento */

