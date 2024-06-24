package exemplosDevMedia.date_array_e_string.topico04_7;

public class AdicaoDeStrings {

    public static void main(String[] args) {

        String nome = "Arthur";
        String sobrenome = "Oliveira";

        String nomeCompleto = nome + sobrenome;
        System.out.println(nomeCompleto);

        String nomeCompleto2 = nome.concat(sobrenome);
        System.out.println(nomeCompleto2);
    }
}

/*
Note que se o valor de nome for Ar e sobrenome for Oliveira,
o resultado do código acima será ArthurOliveira, porque não há espaço entre os dois textos.
 */