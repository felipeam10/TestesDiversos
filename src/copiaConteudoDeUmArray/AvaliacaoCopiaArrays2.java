package copiaConteudoDeUmArray;

import java.util.Arrays;
import java.util.Random;

public class AvaliacaoCopiaArrays2 {

    public static void main(String[] args) {

        //(0) declara de variáveis e preenche o array "a"
        long startTime;
        long endTime;

        int [] a = new int[9999999];

        Random numeros = new Random();
        for (int i=0; i < a.length; i++) a[i] = numeros.nextInt();

        //=----------------------------------------
        //- cópia com a abordagem 1 (comando for)
        //=----------------------------------------
        startTime = System.currentTimeMillis();

        int [] b1 = new int[a.length]; //aloca espaço para b1
        for (int i=0; i < a.length; i++) b1[i] = a[i];

        endTime = System.currentTimeMillis();

        System.out.println("Metodo 1 -> tempo de processamento (comando for)        -> "
                + (endTime - startTime));

        //=----------------------------------------
        //- cópia com a abordagem 2 (método clone)
        //=----------------------------------------
        startTime = System.currentTimeMillis();

        int[] b2 = a.clone();

        endTime = System.currentTimeMillis();

        System.out.println("Metodo 2 -> tempo de processamento (método clone)       -> "
                + (endTime - startTime));

        //=----------------------------------------
        //- cópia com a abordagem 3 (método System.arraycopy)
        //=----------------------------------------
        startTime = System.currentTimeMillis();

        int [] b3 = new int[a.length]; //aloca espaço para b
        System.arraycopy(a, 0, b3, 0, a.length);

        endTime = System.currentTimeMillis();

        System.out.println("Metodo 3 -> tempo de processamento (System.arraycopy)   -> "
                + (endTime - startTime));

        //=----------------------------------------
        //- cópia com a abordagem 4 (método Arrays.copyOf)
        //=----------------------------------------
        startTime = System.currentTimeMillis();

        int [] b4 = Arrays.copyOf(a, a.length);

        endTime = System.currentTimeMillis();

        System.out.println("Metodo 4 -> tempo de processamento (Arrays.copyOf)      -> "
                + (endTime - startTime));


    }

}
