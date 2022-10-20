package copiaConteudoDeUmArray;

public class CopiaParte {

    public static void main(String[] args) {

        //(1) cria o array "a" e o preenche com os caracteres da palavra "utopia"
        char[] a = { 'u', 't', 'o', 'p', 'i', 'a'};


        //(2) Copia apenas a palavra "top" para o array b, usando “System.arraycopy()”

        char [] b = new char[4];          //primeiro é preciso reservar espaço para b
        System.arraycopy(a, 2, b, 0, 4);  //agora copiamos a palavra "top"


        //(3) exibe o conteúdo de "b"
        for (int i=0; i < b.length; i++) {
            System.out.println("b[" + i + "]=" + b[i]);
        }
    }
}
