package exemplosDevMedia.date_array_e_string.topico04_10;

public class ConcatenaString03 {

    public static void main (String[] args){

        /*
         * A nossa string abaixo é um uso ideal para o operador '+',
         * pois não estamos criando nenhum novo objeto em memória,
         * apenas melhorando a
         * legibilidade do código.
         * */
        String strFinal = "Feliz " +
                "Natal " +
                "Aos Leitores "+
                "da DEVMEDIA "+
                "hohoho...";

        //Também poderiamos usar desta forma sem
        //prejudicar a performance do programa
        int x = 10;
        int y = 20;
        System.out.println("x:"+x+" y:"+y);
    }
}
