package exemplosDevMedia.date_array_e_string.topico05_6;

public class VarArgsExamples {
    public static void main(String[] args) {
        System.out.println(metodo(1, 2, 3, 4, 5));
        System.out.println(metodo(6, 7, 8));
    }

    public static int metodo(int... a) {
        int soma = 0;
        for (int i:a) {
            soma += i;
        }
        return soma;
    }
}
