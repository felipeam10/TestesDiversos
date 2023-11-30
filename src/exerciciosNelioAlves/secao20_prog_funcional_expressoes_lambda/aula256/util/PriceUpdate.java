package exerciciosNelioAlves.secao20_prog_funcional_expressoes_lambda.aula256.util;

import exerciciosNelioAlves.secao20_prog_funcional_expressoes_lambda.aula256.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
