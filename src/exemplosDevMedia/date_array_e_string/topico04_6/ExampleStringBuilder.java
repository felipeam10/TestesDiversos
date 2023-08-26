package exemplosDevMedia.date_array_e_string.topico04_6;

public class ExampleStringBuilder {

    public static void main(String[] args) {

        String tabela = "funcionario";
        String orderBy = " ORDER BY nome";
        StringBuilder sql = new StringBuilder("SELECT cpf, nome ");
        sql.append("FROM ");
        sql.append(tabela);
        sql.append(" WHERE sexo = 'M'").append(orderBy);

        System.out.println("tabela: " + tabela);
        System.out.println("orderBy: " + orderBy);
        System.out.println("sql: " + sql);
    }
}
