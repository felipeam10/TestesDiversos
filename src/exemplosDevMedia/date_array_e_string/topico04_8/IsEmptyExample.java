package exemplosDevMedia.date_array_e_string.topico04_8;

public class IsEmptyExample {

    public static void main(String[] args) {

        String valor = null;
        System.out.println(valor.isEmpty());
    }
}

//   Um método muito utilizado e comum que verifica se uma String está ou não vazia,
// mas tenha atenção neste método, pois a verificação baseia-se se sua String possui tamanho = 0,
// ou seja, o String.length() = 0.
// Isso significa que caso você tente utilizar o isEmpty() em uma String que possui valor NULL você receberá um NullPointerException.