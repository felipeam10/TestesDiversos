package exemplosDevMedia.date_array_e_string.topico05_6;

public class VarArgsExamples01 {
    public static void main(String... args) {
        int i = 5;
        metodo(i);           // chama a versão long
    }

    public static void metodo(Integer a) {
        System.out.println("Integer");
    }

    public static void metodo(long a) {
        System.out.println("long");
    }
}
