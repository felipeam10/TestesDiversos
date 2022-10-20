package calculadora;

import java.math.BigDecimal;

public class Divisao implements Operacao{

    @Override
    public BigDecimal calcular(BigDecimal x, BigDecimal y) {
        BigDecimal resultado = null;

        // se qualquer um dos operadores for nulo retornaremos null
        if (x == null || y == null) {
            resultado = null;
        }
        else {
            // ... se nenhum dos operadores for nulo, verificamos ainda
            // se o divisor é diferente de ZERO para realizar a operação.
            // Se o divisor for igual a ZERO, retornaremos nulo.
            resultado = (y.compareTo(new BigDecimal(0)) == 0 ? null : x.divide(y, 3, BigDecimal.ROUND_HALF_UP));
        }
        return resultado;
    }
}
