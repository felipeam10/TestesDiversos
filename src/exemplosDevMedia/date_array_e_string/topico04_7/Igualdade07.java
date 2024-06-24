package exemplosDevMedia.date_array_e_string.topico04_7;

public class Igualdade07 {

    public static void main(String[] args) {

        String texto = "A API de Strings é uma das mais utilizadas na linguagem Java";
        String linguagem = texto.substring(texto.indexOf("Java"), texto.length());

        if (linguagem.compareToIgnoreCase("java") == 0) {
            System.out.println("compareToIgnoreCase: Encontrei a linguagem! Ela é " + linguagem);
        }

        if(linguagem.compareTo("java") == 0) {
            System.out.println("compareTo: Encontrei a linguagem! Ela é " + linguagem);
        }
    }
}
