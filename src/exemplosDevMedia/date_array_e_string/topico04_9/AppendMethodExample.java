package exemplosDevMedia.date_array_e_string.topico04_9;

public class AppendMethodExample {

    public static void main(String[] args) {

        StringBuilder nomes = new StringBuilder();
        nomes.append("Carlos>").append("Maria>").append("José>").append("Renata");

        System.out.println(nomes.toString());
    }
}
