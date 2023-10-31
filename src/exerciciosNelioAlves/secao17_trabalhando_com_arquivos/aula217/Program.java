package exerciciosNelioAlves.secao17_trabalhando_com_arquivos.aula217;

import java.io.*;

public class Program {

    public static void main(String[] args) throws FileNotFoundException {


        String path = "C:\\Users\\DELL\\workspace-projects\\TestesDiversos\\src\\resources\\out.txt";

        String lines[] = new String[] {"Good Morning", "Good afternoon", "Good Evening"};

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
