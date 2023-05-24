package exerciciosNelioAlves.aula111;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        //DOC
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt04 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt05 = DateTimeFormatter.ISO_INSTANT;


        LocalDate d04 = LocalDate.parse("2023-05-23");
        LocalDateTime d05 = LocalDateTime.parse("2023-05-23T01:03:44");
        Instant d06 = Instant.parse("2023-05-23T01:03:44Z");
        Instant d07 = Instant.now();

        System.out.println("d04 = " + d04.format(fmt01));
        System.out.println("d04 = " + fmt01.format(d04));
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("d05 = " + d05.format(fmt01));
        System.out.println("d05 = " + d05.format(fmt02));
        System.out.println("d05 = " + d05.format(fmt04));

        System.out.println("d06 = " + fmt03.format(d06));
        System.out.println("d06 = " + fmt05.format(d06));

        System.out.println("d07 = " + fmt03.format(d07));

    }

}
