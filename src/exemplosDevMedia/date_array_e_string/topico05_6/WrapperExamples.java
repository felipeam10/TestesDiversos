package exemplosDevMedia.date_array_e_string.topico05_6;

public class WrapperExamples {

    public static void main(String[] args) {

        Integer i = new Integer(54);
        byte b = i.byteValue(); // b recebe 54
        System.out.println("b = " + b);

        Double d1 = new Double(354.5);
        byte b2 = d1.byteValue(); // b2 recebe 98 – perda de precisão
        System.out.println("b2 = " + b2);

        Double d = new Double(25.4);
        int i1 = d.intValue(); // i1 recebe 25
        System.out.println("i1 = " + i1);

        byte b1 = d.byteValue(); // b1 recebe 25
        System.out.println("b1 = " + b1);

        Float f = new Float(3.9f);
        short s = f.shortValue(); // s recebe 3
        System.out.println("s = " + s);
    }
}
