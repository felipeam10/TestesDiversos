package exemplosDevMedia.date_array_e_string.topico04_9;

public class StringBuilderInsert {

    public static void main(String[] args) {

        Object objetoRef = "Maria";
        String String = "Joaquina";
        char[] conjArray = {'S','i','l','v','a'};

        StringBuilder buffer = new StringBuilder();
        buffer.insert(0, objetoRef);
        buffer.insert(0, " ");
        buffer.insert(0, String);
        buffer.insert(0, " ");
        buffer.insert(0, conjArray);
        buffer.insert(0, " ");

        System.out.printf("Valores:\n%s\n\n", buffer.toString());
    }

//    The code builds a string by inserting elements ("Maria", "Joaquina", "Silva", and spaces) into a StringBuilder object
//    in reverse order (starting from the last element to the first). The final string is then printed to the console.
}
