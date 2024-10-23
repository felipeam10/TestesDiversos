package exemplosDevMedia.date_array_e_string.topico04_8;

public class ToCharArrayExample {
    public static void main(String[] args) {

        String valor = "DEVMEDIA - Java";


        for(char c : valor.toCharArray()){
            System.out.println("Char: "+ c);
        }
    }
}
