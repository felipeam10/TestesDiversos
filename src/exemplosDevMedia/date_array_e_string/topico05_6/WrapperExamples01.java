package exemplosDevMedia.date_array_e_string.topico05_6;

public class WrapperExamples01 {
    public static void main(String[] args) {
        String s1 = Long.toString(45L, 16); // converte 45L para hexadecimal
        System.out.println("Hexa = " + s1); // exibe "Hexa = 2d"
        String s2 = Long.toString(45L, 16).toUpperCase();
        System.out.println("Hexa = " + s2); // exibe "Hexa = 2D"
    }
}
