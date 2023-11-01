package exerciciosNelioAlves.secao17_trabalhando_com_arquivos.aula220;

import java.io.*;

public class Program {

    public static void main(String[] args) {
        String inputFile = "C:\\Users\\DELL\\workspace-projects\\TestesDiversos\\src\\resources\\input.csv";
        String sourceFolderStr = "C:\\Users\\DELL\\workspace-projects\\TestesDiversos\\src\\resources";
        String outputFile = "C:\\Users\\DELL\\workspace-projects\\TestesDiversos\\src\\resources\\out\\summary.csv";
        boolean success = new File(sourceFolderStr + "\\out").mkdir();

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String itemName = parts[0].trim();
                    double unitPrice = Double.parseDouble(parts[1].trim());
                    int quantity = Integer.parseInt(parts[2].trim());

                    double totalValue = unitPrice * quantity;
                    String summaryLine = itemName + ": " + totalValue;

                    bw.write(summaryLine);
                    bw.newLine();
                }
            }

            br.close();
            bw.close();

            System.out.println("Summary CSV file created successfully at " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

