package calculadora;

import javax.swing.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

public class Calculadora {

    private static final BigDecimal ZERO = new BigDecimal(0);

    private static BigDecimal x = Calculadora.ZERO;
    private static BigDecimal y = Calculadora.ZERO;
    private static BigDecimal z = Calculadora.ZERO;

    private static String opcao = "";

    public static void main(String[] args) {

        Operacao operacao = null;
        solicitarOperacao();

        // Se nada foi informado
        if ("".equals(opcao)) {
            apresentarMensagemOpcaoInvalida();
        }
        else {
            // mudar todas as letras para maiúsculas...
            opcao = opcao.toUpperCase();

            // Se mais de uma letra foi informada, apenas a primeira será considerada
            char opt = opcao.charAt(0);

            // verificamos se a letra está entre aquelas que nos interessam
            switch (opt) {

                // Para cada opção escolhida instanciamos uma especialização
                // de Operacao
                case 'A':
                    operacao = new Adicao();
                    break;
                case 'D':
                    operacao = new Divisao();
                    break;
                case 'M':
                    operacao = new Multiplicacao();
                    break;
                case 'S':
                    operacao = new Subtracao();
                    break;
                default:
                    apresentarMensagemOpcaoInvalida();

            }
            solicitarValores();
            z = operacao.calcular(x, y);
            apresentarResultado();
        }

    }

    private static void apresentarResultado() {

        StringBuilder sbMsg = new StringBuilder("");
        sbMsg.append("Resultado: \n");
        sbMsg.append(z);

        JOptionPane.showMessageDialog(null, sbMsg.toString(), "Calculadora",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static void apresentarMensagemOpcaoInvalida() {

        StringBuilder sbMsg = new StringBuilder("");
        sbMsg.append("Nenhuma opção válida informada! \n");
        sbMsg.append("Abandonando o programa.");

        JOptionPane.showMessageDialog(null, sbMsg.toString(), "Calculadora",
                JOptionPane.WARNING_MESSAGE);
        System.exit(0);
    }

    private static void solicitarOperacao() {

        StringBuilder sbSolicitacao = new StringBuilder("Escolha uma das opções abaixo: \n\n");
        sbSolicitacao.append("A - Adição \n\n");
        sbSolicitacao.append("D - Divisão \n\n");
        sbSolicitacao.append("M - Multiplicação \n\n");
        sbSolicitacao.append("S - Subtração \n\n");

        opcao = JOptionPane.showInputDialog(null, sbSolicitacao.toString(),
                "Calculadora em Java", JOptionPane.QUESTION_MESSAGE);
    }

    private static void solicitarValores() {
        x = solicitarValor();
        y = solicitarValor();
    }

    private static BigDecimal solicitarValor() {

        NumberFormat numberFormat = new DecimalFormat("#,##0.00");
        // se um valor inválido for informado, o padrão será ZERO
        BigDecimal valor = Calculadora.ZERO;
        String resposta = "";
        resposta = JOptionPane.showInputDialog(null, "Informe um valor",
                "Solicitar Valor", JOptionPane.QUESTION_MESSAGE);

        // se nada foi informado...
        if ("".equals(resposta)) {
            return valor;
        }
        // se a resposta for um valor não numérico lançará uma exceção,
        // e neste caso vamos retornar o valor padrão
        try {
            valor = new BigDecimal(numberFormat.parse(resposta).toString());
        } catch (ParseException e) {
            valor = Calculadora.ZERO;
        }
        return valor;

    }
}
