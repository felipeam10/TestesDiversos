package exemplosDevMedia.date_array_e_string.topico04_7;

public class SubstringExample {

    public static void main(String[] args) {

        String nome = "José Silveira";
        System.out.println("String : " + nome);

        String substring = nome.substring(5);
        System.out.println("String depois da 3º index: " + "["+substring+"]");

        substring = nome.substring(1, 6);
        System.out.println("Substring (1,6): " + "["+substring+"]");
    }
}
