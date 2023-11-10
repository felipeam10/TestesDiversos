package exerciciosNelioAlves.secao20_prog_funcional_expressoes_lambda.aula252.application;

import exerciciosNelioAlves.secao20_prog_funcional_expressoes_lambda.aula252.entities.Product;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}
