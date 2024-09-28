package exemplosDevMedia.date_array_e_string.topico04_7;

public class ToCharArrayExample {

    public static void main(String[] args) {
        // Define a string
        String str = "Hello, StackSpot!";

        // Convert the string to a char array
        char[] charArray = str.toCharArray();

        // Convert each character to uppercase and print it
        System.out.println("Uppercase Character array:");
        for (int i = 0; i < charArray.length; i++) {
            // Convert the character to uppercase
            charArray[i] = Character.toUpperCase(charArray[i]);

            // Print the uppercase character on the same line
            System.out.print(charArray[i]);
        }

        // Print a newline after the loop to move to the next line
        System.out.println();
    }
}
