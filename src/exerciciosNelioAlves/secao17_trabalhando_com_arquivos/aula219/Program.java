package exerciciosNelioAlves.secao17_trabalhando_com_arquivos.aula219;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {


//        C:\\Users\\DELL\\workspace-projects\\TestesDiversos\\src\\resources\\out.txt

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("getName: " + path.getName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getPath: " + path.getPath());

        sc.close();
    }
}
