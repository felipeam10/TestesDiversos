package exemplosDevMedia;

public class Listagem08 {

    public static void main(String[] args) {
        String semaforo[] = {"vermelho", "amarelo", "verde"};

        System.out.printf("Ordem de um Semáforo:\n");
        for (String sinal: semaforo) { // instrução "for" aprimorada
            System.out.printf("%s\n", sinal);
        }
    }
}
