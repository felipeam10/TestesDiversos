package exemplosDevMedia.date_array_e_string.topico04_8;

public class ToLowerCaseToUpperCaseETrimExample {

    public static void main(String[] args) {

        String valor = " DEVMEDIA - Java ";

        System.out.println(valor.toLowerCase());
        System.out.println(valor.toUpperCase());
        System.out.println(valor.trim());
    }
}

//    O método toLowerCase converte toda a String para caixa baixa e o toUpperCase faz o inverso, convertendo toda a String para caixa alta.
//    O método trim remove espaços em branco no inicial e no final da String