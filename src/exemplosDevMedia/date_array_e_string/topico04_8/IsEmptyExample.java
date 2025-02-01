package exemplosDevMedia.date_array_e_string.topico04_8;

public class IsEmptyExample {
    public static void main(String[] args) {

        String str1 = "";
        String str2 = "Hello, World!";
        String str3 = null;

        // Check if str1 is empty
        if (str1.isEmpty()) {
            System.out.println("str1 is empty.");
        } else {
            System.out.println("str1 is not empty.");
        }

        // Check if str2 is empty
        if (str2.isEmpty()) {
            System.out.println("str2 is empty.");
        } else {
            System.out.println("str2 is not empty.");
        }

        if (str3.isEmpty()) {
            System.out.println("NPE");
        } // Using isEmpty incorrectly
    }
//    Um método muito utilizado e comum que verifica se uma String está ou não vazia,
//    mas tenha atenção neste método, pois a verificação baseia-se se sua String possui tamanho = 0,
//    ou seja, o String.length() = 0. Isso significa que caso você tente utilizar o isEmpty() em uma String que possui valor NULL você receberá um NullPointerException.
}
