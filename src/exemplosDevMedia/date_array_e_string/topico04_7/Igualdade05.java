package exemplosDevMedia.date_array_e_string.topico04_7;

public class Igualdade05 {

    public static void main(String[] args) {

        String nome1 = "Carlos";
        String nome2 = "carlos";

        if(nome1.equalsIgnoreCase(nome2)) {
            System.out.println("Os nomes são iguais!");
        }
    }
}

/* equalsIgnoreCase = Esse método ignora a distinção entre letras maiúsculas e minúsculas nas duas strings comparadas */