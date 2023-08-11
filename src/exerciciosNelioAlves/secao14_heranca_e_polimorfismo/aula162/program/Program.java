package exerciciosNelioAlves.secao14_heranca_e_polimorfismo.aula162.program;

import exerciciosNelioAlves.secao14_heranca_e_polimorfismo.aula162.entities.ImportedProduct;
import exerciciosNelioAlves.secao14_heranca_e_polimorfismo.aula162.entities.Product;
import exerciciosNelioAlves.secao14_heranca_e_polimorfismo.aula162.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used, or imported (c/u/i)? ");
            char type = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine(); // Consume the newline character left by the previous nextInt()
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (type == 'c') {
                list.add(new Product(name, price));
            }
            else if (type == 'u') {
                System.out.print("Data de fabricacao (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, date));
            }
            else {
                System.out.print("Taxa de importacao: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            }
        }

        System.out.println("\nPRICE TAGS:");
        for (Product product : list) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }

}
