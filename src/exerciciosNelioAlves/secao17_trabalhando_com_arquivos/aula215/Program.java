package exerciciosNelioAlves.secao17_trabalhando_com_arquivos.aula215;

import java.io.*;

public class Program {

    public static void main(String[] args) throws FileNotFoundException {


        String path = "C:\\Users\\DELL\\workspace-projects\\TestesDiversos\\src\\resources\\inA.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
