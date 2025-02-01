package exemplosDevMedia.date_array_e_string.topico04_8;

public class SplitExample {

    public static void main(String[] args) {

        /*
         * Uso do split sem o LIMIT
         * */
        String valor = "DEVMEDIA - Java";
        String[] valorComSplit = valor.split("-");

        for(String s : valorComSplit){
            System.out.println(s);
        }

        /*
         * Uso do split com o LIMIT
         * */
        String valor2 = "DEVMEDIA - Java - Engenharia - Software";
        String[] valorComSplit2 = valor2.split("-", 2);

        for(String s : valorComSplit2){
            System.out.println(s);
        }
    }
//    Por que no segundo bloco de código o split não divide “Java – Engenharia – Software” ?
//    Simples, pois explicitamente dizemos quantas vezes o regex será aplicado,
//    o que influência diretamente no tamanho final do nosso vetor, que será igual a dois.
}
