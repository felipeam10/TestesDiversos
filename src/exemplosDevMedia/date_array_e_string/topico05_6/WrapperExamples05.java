package exemplosDevMedia.date_array_e_string.topico05_6;

public class WrapperExamples05 {
    public static void main(String[] args) {
        if (isPar(6)) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
    }

    public static Boolean isPar(Integer i) {          // boxing o int 5
        if (i % 2 == 0) {                        // unboxing o Integer i
            return true;                                  // boxing para retornar
        } else {
            return false;
        }
    }
}
