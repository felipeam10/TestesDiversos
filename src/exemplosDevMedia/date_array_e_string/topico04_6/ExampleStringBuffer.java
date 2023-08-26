package exemplosDevMedia.date_array_e_string.topico04_6;

public class ExampleStringBuffer {

    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer("2468");
        buffer.reverse().insert(1,"xxx").append("999");
        System.out.println(buffer.toString());


//        StringBuffer buffer = new StringBuffer("2468");
//        buffer.reverse();
//        buffer.insert(1,"xxx");
//        buffer.append("999");
//        System.out.println(buffer.toString());
    }
}
