package exemplosDevMedia.date_array_e_string.topico04_6;

public class MetodoContains {

    public static void main(String[] args) {

        /**
         O método contains() não tem como retorno uma nova String, mas sim um boolean.
         Ele avalia se a String original contém a String passada como parâmetro para o método.
         Um detalhe interessante é que o método contains() também é Case Sensitive.
         No caso do código acima, o resultado será true, porém, se a String passada como parâmetro estivesse escrita “Marcos”, o resultado seria false.
         */

        String s = "001MARCOS PAULO     M19803112";
        System.out.println(s.contains("MARCOS"));
    }
}
