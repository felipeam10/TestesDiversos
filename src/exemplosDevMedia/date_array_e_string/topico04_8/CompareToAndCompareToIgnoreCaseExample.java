package exemplosDevMedia.date_array_e_string.topico04_8;

public class CompareToAndCompareToIgnoreCaseExample {

    public static void main(String[] args) {

        String valor = "DEVMEDIA - Java";

        System.out.println(valor.compareTo("DEVMEDIA - Java") == 0 ? true : false);
        System.out.println(valor.compareTo("DEVMEDIA - JAVA") == 0 ? true : false);
        System.out.println(valor.compareToIgnoreCase
                ("DEVMEDIA - JAVA") == 0 ? true : false);
    }
}
