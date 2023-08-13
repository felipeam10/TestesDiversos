package exemplosDevMedia.date_array_e_string.topico04_6;

public class PoolDeStrings2 {

    public static void main(String[] args) {

        String s1 = "Meu nome era ";
        String s2 = "Michel";
        String s3 = s1;
        s1.replace("era","é");
        String s4 = s3.replace("era","sempre foi ");
        s3 = s4 + s2;
        System.out.println(s3);
    }
}
