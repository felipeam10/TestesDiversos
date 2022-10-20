package calculadora;

import java.math.BigDecimal;

public class Subtracao implements Operacao{

    @Override
    public BigDecimal calcular(BigDecimal x, BigDecimal y) {
        BigDecimal resultado = null;
        // se nenhum dos operadores for nulo
        return resultado = (x != null && y != null ? x.subtract(y) : null);

    }
}
