package calculadora;

import java.math.BigDecimal;

public class Multiplicacao implements Operacao{

    @Override
    public BigDecimal calcular(BigDecimal x, BigDecimal y) {
        BigDecimal resultado = null;
        // se nenhum dos operadores for nulo
        return resultado = (x != null && y != null ? x.multiply(y) : null);
    }
}
