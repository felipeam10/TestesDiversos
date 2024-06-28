package exemplosDevMedia.date_array_e_string.topico04_7;

public class IndexOflastIndexOfExamples {

    public static void main(String[] args) {

        String letras = "abcadefghijklmcopqrsdeftuvz";

        //TESTA indexOf PARA LOCALIZAR UM CARACTERE EM UM STRING
        System.out.printf("Último 'c' está localizado no index %d\n", letras.indexOf('c'));
        System.out.printf("Último 'a' está localizado no index %d \n", letras.indexOf('a', 1));

        //-1 NÃO EXISTE
        System.out.printf("'$' está localizado no index %d\n\n", letras.indexOf('$'));

        //TESTA lastIndexOf PARA LOCALIZAR UM CARACTERE EM UMA STRING
        System.out.printf("Último 'c' está localizado no index %d\n", letras.lastIndexOf('c'));
        System.out.printf("Último 'a' está localizado no index %d\n", letras.lastIndexOf('a', 5));
        System.out.printf("Último '$' está localizado no index %d\n", letras.lastIndexOf('$'));

        //TESTA indexOf PARA LOCALIZAR UMA SUBSTRING EM UMA STRING
        System.out.printf("\"def\" está localizado no index %d\n", letras.indexOf("def"));

        //2 argumento string e outro o ponto inicial que começará a pesquisa
        System.out.printf("\"def\" está localizado no index %d\n", letras.indexOf("def", 7));
        System.out.printf("\"hello\" está localizado no index %d\n\n", letras.indexOf("hello"));
    }
}
