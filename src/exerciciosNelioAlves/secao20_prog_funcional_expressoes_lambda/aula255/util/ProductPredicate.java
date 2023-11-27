package exerciciosNelioAlves.secao20_prog_funcional_expressoes_lambda.aula255.util;

import exerciciosNelioAlves.secao20_prog_funcional_expressoes_lambda.aula255.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {
    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100;
    }
}
