package copiaConteudoDeUmArray;

import java.util.Random;

public class CopiaArrayCopy {

    public static void main(String[] args) {

        //(1) cria o array "a" e o preenche com uma sequência de números aleatórios
        int [] a = new int[5];
        Random numeros = new Random();
        for (int i=0; i < a.length; i++) {
            a[i]=numeros.nextInt();
            System.out.println("a[" + i + "]=" + a[i]);
        }
        System.out.println();

        //(2) Copia o conteúdo de "a" para "b" com o uso do método “System.arraycopy”

        int [] b = new int[a.length];                //primeiro é preciso reservar espaço para b
        System.arraycopy(a, 0, b, 0, a.length);  //agora podemos copiar


        //(3) exibe o conteúdo de "b"
        for (int i=0; i < a.length; i++) {
            System.out.println("b[" + i + "]=" + b[i]);
        }
    }
}
