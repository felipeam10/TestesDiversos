package exemplosDevMedia;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class BrincandoComDatas {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println("Dia da semana: " + localDate.getDayOfWeek().name());
        System.out.println("Dia da semana: " + localDate.getDayOfWeek().ordinal());
        System.out.println("Mes: " + localDate.getMonthValue());
        System.out.println("Mes: " + localDate.getMonth().name());
        System.out.println("Ano: " + localDate.getYear());


        long instateInicial = System.currentTimeMillis();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long instanteFinal = System.currentTimeMillis();
        long duracaoEmMilesegundos = instanteFinal - instateInicial;
        System.out.println("Duração em segundos: " + ( duracaoEmMilesegundos / 1000 ) % 60 );

        System.out.println("--------------------Classe Instant -----------------------");

        Instant iInicial = Instant.now();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Instant iFinal = Instant.now();

        Duration duracao = Duration.between(iInicial, iFinal);

        System.out.println("Duração em nanos segundos: " + duracao.toNanos());
        System.out.println("Duração em minutos: " + duracao.toMinutes());
        System.out.println("Duração em horas: " + duracao.toHours());
        System.out.println("Duração em milisegundos: " + duracao.toMillis());
        System.out.println("Duração em dias: " + duracao.toDays());

        System.out.println("-------------------- Comparacao entre datas -----------------------");

        LocalDate localDateAntigo = LocalDate.of(2010, 3, 7);
        LocalDate localDateNovo = LocalDate.of(2015, 3,5);

        System.out.println(localDateAntigo.isAfter(localDateNovo));
        System.out.println(localDateAntigo.isBefore(localDateNovo));
        System.out.println(localDateAntigo.isEqual(localDateNovo));

        Period periodo = Period.between(localDateAntigo, localDateNovo);
        System.out.println(periodo.getYears() + " Anos " + periodo.getMonths() + " Meses " + periodo.getDays() + " Dias");
        System.out.println("Apenas meses: " + periodo.toTotalMonths());


        System.out.println("-------------------- Operacoes com datas -----------------------");

        LocalDate dataManipulacao = LocalDate.now();
        System.out.println("Data Original:  " + dataManipulacao);
        System.out.println("Mais 5 dias:    " + dataManipulacao.plusDays(5));
        System.out.println("Mais 5 semanas: " + dataManipulacao.plusWeeks(5));
        System.out.println("Mais 5 anos:    " + dataManipulacao.plusYears(5));
        System.out.println("Mais 2 meses:   " + dataManipulacao.plusMonths(2));
        System.out.println("Menos 1 ano:    " + dataManipulacao.minusYears(1));
        System.out.println("Menos 1 mês:    " + dataManipulacao.minusMonths(1));
        System.out.println("Menos 3 dia:    " + dataManipulacao.minusDays(3));

        System.out.println("-------------------- Fuso horário de cidades diferentes -----------------------");

        LocalDateTime hora = LocalDateTime.of(2016, Month.APRIL, 4, 22, 30);

        ZoneId fusoHorarioDeSaoPaulo = ZoneId.of("America/Sao_Paulo");
        ZonedDateTime horaSaoPaulo = ZonedDateTime.of(hora, fusoHorarioDeSaoPaulo);
        System.out.println(horaSaoPaulo);

        ZoneId fusoHorarioDeParis = ZoneId.of("Europe/Paris");
        ZonedDateTime horaParis = ZonedDateTime.of(hora, fusoHorarioDeParis);
        System.out.println(horaParis);

        Duration diferencaDeHoras = Duration.between(horaSaoPaulo, horaParis);
        System.out.println(diferencaDeHoras.getSeconds() / 60 / 60);

        System.out.println("-------------------- Formatação de datas -----------------------");

        LocalDate hoje = LocalDate.now();
        DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatadorBarra1 = DateTimeFormatter.ofPattern("yyyy/yyyy/MM");
        DateTimeFormatter formatadorTraco = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Data com /: " + hoje.format(formatadorBarra));
        System.out.println("Data com /: " + hoje.format(formatadorBarra1));
        System.out.println("Data com -: " + hoje.format(formatadorTraco));



        System.out.println("-------------------- Verifica se o ano da data é bissexto -----------------------");


        LocalDate data = LocalDate.of(2016, 4, 7); //setei aqui um ano bissexto de proposito
//        LocalDate data = LocalDate.now();
        DateTimeFormatter formatadorTraco2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Ano bissexto: " + data.isLeapYear());
        System.out.println("Número de dias do mês: " + data.lengthOfMonth());
        System.out.println("Número de dias do ano: " + data.lengthOfYear());
        System.out.println("Menor data: " + LocalDate.MIN.format(formatadorTraco2));
        System.out.println("Maior data: " + LocalDate.MAX.format(formatadorTraco2));
    }
}
