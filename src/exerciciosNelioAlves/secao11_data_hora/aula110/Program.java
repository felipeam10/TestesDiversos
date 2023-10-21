package exerciciosNelioAlves.secao11_data_hora.aula110;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        //DOC
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2023-05-23");
        LocalDateTime d05 = LocalDateTime.parse("2023-05-23T01:03:44");
        Instant d06 = Instant.parse("2023-05-23T01:03:44Z");

        //o d07 deu erro no java11, tive que alterar para o java17 dai funcionou
        Instant d07 = Instant.parse("2023-05-23T01:05:45-03:33");

        LocalDate d08 = LocalDate.parse("23/05/2023", fmt01);
        LocalDateTime d09 = LocalDateTime.parse("23/05/2023 01:44", fmt02);

        LocalDate d10 = LocalDate.of(2023, 05, 23);
        LocalDateTime d11 = LocalDateTime.of(2023, 05, 23, 8, 58);


        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);

    }

}
