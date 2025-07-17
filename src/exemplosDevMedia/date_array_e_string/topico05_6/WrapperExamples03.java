package exemplosDevMedia.date_array_e_string.topico05_6;

public class WrapperExamples03 {
    public static void main(String[] args) {
        Integer i = new Integer(125);
        Integer j = i;
        System.out.println(i==j); // (true) referem-se a um mesmo objeto
        i++;
        System.out.println("i = " + i);
        System.out.println(i==j); // (false) referem-se a objetos diferentes
    }
}
