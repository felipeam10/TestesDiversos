package exemplosDevMedia;

public class TiposDeDadosSimples {

    public static void main(String[] args) {
        int nota0 = 80;
        int nota1 = 70;
        int nota2 = 90;
        int nota3 = 85;
        int nota4 = 100;

        System.out.printf("nota0 = %d\n", nota0);
        System.out.printf("nota1 = %d\n", nota1);
        System.out.printf("nota2 = %d\n", nota2);
        System.out.printf("nota3 = %d\n", nota3);
        System.out.printf("nota4 = %d\n", nota4);

        int soma = nota0 + nota1 + nota2 + nota3 + nota4;
        double media = soma / 5.0;
        System.out.printf("\nMédia Aritmética Simples = %.2f\n", media);
    }
}
