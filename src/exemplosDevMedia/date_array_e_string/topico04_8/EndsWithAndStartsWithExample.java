package exemplosDevMedia.date_array_e_string.topico04_8;

public class EndsWithAndStartsWithExample {

    public static void main(String[] args) {

        String valor = "DEVMEDIA - Java";

        System.out.println(valor.endsWith("Java"));
        System.out.println(valor.startsWith("DEV"));
        System.out.println(valor.startsWith("ME", 3));
    }
}
