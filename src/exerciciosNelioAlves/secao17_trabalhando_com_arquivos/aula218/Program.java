package exerciciosNelioAlves.secao17_trabalhando_com_arquivos.aula218;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {


//        C:\\Users\\DELL\\workspace-projects\\TestesDiversos\\src\\resources\\out.txt

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        // Vai ler todas as pastas do diretório que for inserido
        File folders[] = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        // Vai ler todos os arquivos que estão em determinada pasta
        File files[] = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for (File file : files) {
            System.out.println(file);
        }

        // Vai criar uma subpasta a partir da pasta inserida
        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created successfully: " + success);

        sc.close();
    }
}
