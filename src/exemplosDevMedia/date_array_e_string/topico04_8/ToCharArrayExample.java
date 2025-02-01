package exemplosDevMedia.date_array_e_string.topico04_8;

public class ToCharArrayExample {

    public static void main(String[] args) {

        String valor = "DEVMEDIA - Java";

        for (char c : valor.toCharArray()) {
            System.out.println("Char: " + c);
        }
//        Converte uma String em um Array de char, ou seja, uma String de 10 posições irá ser convertida em um vetor char[] de 10 posições
    }
}
