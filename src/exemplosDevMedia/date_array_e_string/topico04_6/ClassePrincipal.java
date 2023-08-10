package exemplosDevMedia.date_array_e_string.topico04_6;

public class ClassePrincipal {

    public static void main(String[] args) {
        String minhaString1 = new String();
        minhaString1 = "Java";
        String minhaString2 = "Java";
        String minhaString3 = new String("Java");
        String minhaString4 = "";

        char[] meusChars = new char[] {'J','a','v','a'};
        String minhaString5 = new String(meusChars);

        System.out.println("minhaString1: " + minhaString1);
        System.out.println("minhaString2: " + minhaString2);
        System.out.println("minhaString3: " + minhaString3);
        System.out.println("minhaString4: " + minhaString4);
        System.out.println("minhaString5: " + minhaString5);
    }
}
