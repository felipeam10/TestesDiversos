package exemplosDevMedia.date_array_e_string.topico04_6;

public class MetodoReplace01 {

    public static void main(String[] args) {

        String s = "Gosto de comer frango com batata. Não gosto de batata frita.";
        s = s.replace("batata","polenta");
        System.out.println(s);
    }
}
