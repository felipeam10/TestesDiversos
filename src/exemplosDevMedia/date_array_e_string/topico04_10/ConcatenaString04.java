package exemplosDevMedia.date_array_e_string.topico04_10;

public class ConcatenaString04 {

    public static void main (String[] args){
        long tStart, tEnd, tResult;

        /*
         * ###########################################
         * INICIO BLOCO CONCATENAÇÃO COM StringBuilder
         * ###########################################
         * */
        StringBuilder strBuilder = new StringBuilder();
        tStart = System.currentTimeMillis();
        for(int i = 0; i < 100000; i ++){
            strBuilder.append("a");
        }
        tEnd = System.currentTimeMillis();
        tResult = tEnd - tStart;
        System.out.println("Tempo de Execução com StringBuilder = "+tResult+" ms");
                /*
                 * ###########################################
                 * FIM BLOCO CONCATENAÇÃO COM StringBuilder
                 * ###########################################
                 * */

                /*
                 * ###########################################
                 * INICIO BLOCO CONCATENAÇÃO COM StringBuffer
                 * ###########################################
                 * */
                StringBuffer strBuffer = new StringBuffer();
        tStart = System.currentTimeMillis();
        for(int i = 0; i < 100000; i ++){
            strBuffer.append("a");
        }
        tEnd = System.currentTimeMillis();
        tResult = tEnd - tStart;
        System.out.println("Tempo de Execução com StringBuffer = "+tResult+" ms");
                /*
                 * ###########################################
                 * FIM BLOCO CONCATENAÇÃO COM StringBuffer
                 * ###########################################
                 * */
    }
}
