package exemplosDevMedia.date_array_e_string.topico05_6;

public class WrapperExamples04 {
    public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = 10;
        Integer i3 = 1000;
        Integer i4 = 1000;
        // 1ª comparação
        if (i1 == i2) {
            System.out.println("Mesmo objeto");
        }
        // 2ª comparação
        if (i3 != i4) {
            System.out.println("Objetos diferentes");
        }
        if (i1.equals(i2)) {
            System.out.println("Objetos significativamente iguais");
        }
        if (i3.equals(i4)) {
            System.out.println("Objetos significativamente iguais");
        }
    }
}
