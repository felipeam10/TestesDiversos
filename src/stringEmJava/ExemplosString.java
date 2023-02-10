package stringEmJava;

public class ExemplosString {

    public static void main(String[] args) {

        String s = "Este comentário foi péssimo!";
        s = s.replace("péssimo","ruim");
        System.out.println(s);


        String s2 = "Gosto de comer frango com batata. Não gosto de batata frita.";
        s2 = s2.replace("batata","polenta");
        System.out.println(s2);


        String s3 = "arara";
        s3 = s3.replace('a','e'); // recebendo um char como parâmetro
        System.out.println(s3);


        String s4 = " Java Magazine ";
        s4 = s4.trim();
        System.out.println(s4);
    }
}
