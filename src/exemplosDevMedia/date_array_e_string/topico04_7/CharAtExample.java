package exemplosDevMedia.date_array_e_string.topico04_7;

public class CharAtExample {

    public static void main(String[] args) {

        String nomeCurso = "JAVA";

        if(nomeCurso.charAt(1) == 'A') {
            System.out.println("O caractere A está na posição 1");
        }
        if(nomeCurso.charAt(3) == 'A') {
            System.out.println("O caractere A está na posição 3");
        }
        if(nomeCurso.charAt(2) == 'A') {
            System.out.println("O caractere A está na posição 2");
        } else {
            System.out.println("O caractere A não está na posição 2");
        }
    }
}
