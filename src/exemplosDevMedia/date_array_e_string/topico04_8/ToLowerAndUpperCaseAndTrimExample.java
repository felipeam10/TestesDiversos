package exemplosDevMedia.date_array_e_string.topico04_8;

public class ToLowerAndUpperCaseAndTrimExample {

    public static void main(String[] args) {

        String valor = "DEVMEDIA - Java";

        System.out.println(valor.toUpperCase());
        System.out.println(valor.toLowerCase());
        System.out.println(valor.trim());

        String originalString = "   Hello, World!   ";
        System.out.println("Original String: '" + originalString + "'");

        // Using the trim() method
        String trimmedString = originalString.trim();
        System.out.println("Trimmed String: '" + trimmedString + "'");
    }
}
