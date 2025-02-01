package exemplosDevMedia.date_array_e_string.topico04_8;

public class FormatExample {

    public static void main(String[] args) {

        String result = String.format("Hoje nós processamos %,d transações", 100000);
        System.out.println(result);

        result = String.format("10 / 3 = %.2f", 10.0 / 3.0);
        System.out.println(result);

        // Formatting integers
        int number = 42;
        String formattedNumber = String.format("The number is: %d", number);
        System.out.println(formattedNumber);

        // Formatting floating-point numbers
        double pi = 3.14159;
        String formattedPi = String.format("The value of pi is: %.2f", pi); // 2 decimal places
        System.out.println(formattedPi);

        // Formatting strings
        String name = "Alice";
        int age = 25;
        String formattedString = String.format("My name is %s and I am %d years old.", name, age);
        System.out.println(formattedString);

        // Formatting with padding
        int value = 7;
        String paddedValue = String.format("Padded value: %05d", value); // Pads with zeros to make it 5 digits
        System.out.println(paddedValue);
    }
}
