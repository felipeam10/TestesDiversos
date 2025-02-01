package exemplosDevMedia.date_array_e_string.topico04_8;

public class GetBytesExample {

    public static void main(String[] args) {

        String valor = "DEVMEDIA - Java";

        for (byte b : valor.getBytes()) {
            System.out.println("Byte: " + b);
        }
//        Converte a String em um vetor de byte[]
    }
}
