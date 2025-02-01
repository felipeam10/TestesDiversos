package exemplosDevMedia.date_array_e_string.topico04_8;

public class ValueOfExample {

    public static void main(String[] args) {

        // Converting an integer to a string
        int number = 42;
        String numberString = String.valueOf(number);
        System.out.println("Integer to String: " + numberString);

        // Converting a double to a string
        double pi = 3.14159;
        String piString = String.valueOf(pi);
        System.out.println("Double to String: " + piString);

        // Converting a boolean to a string
        boolean isJavaFun = true;
        String booleanString = String.valueOf(isJavaFun);
        System.out.println("Boolean to String: " + booleanString);

        // Converting a character to a string
        char letter = 'A';
        String charString = String.valueOf(letter);
        System.out.println("Character to String: " + charString);

        // Converting an object to a string
        Object obj = new Object();
        String objectString = String.valueOf(obj);
        System.out.println("Object to String: " + objectString);
    }
}
