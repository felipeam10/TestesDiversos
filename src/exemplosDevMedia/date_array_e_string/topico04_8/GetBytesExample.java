package exemplosDevMedia.date_array_e_string.topico04_8;

public class GetBytesExample {

    public static void main(String[] args) {

        String valor = "DEVMEDIA - Java";
        for(byte b : valor.getBytes()){
            System.out.println("byte: "+ b);
        }
    }
}
//Converte a String em um vetor de byte[].
// Este método é muito útil principalmente quando precisamos salvar caracteres no banco desconsiderando a codificação atual.
// No PostgreSQL, por exemplo, você pode utilizar o tipo “bytea” que é análogo ao “byte” em Java.
// Assim como você pode converter para byte, você também pode voltar para String ou char.