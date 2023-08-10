package exemplosDevMedia.exemplos_OLD;

public class Listagem07 {

    public static void main(String[] args) {
        // declarando e inicializando os vetore "mes" e "diasMes"
        String mes[] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho",
                "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};

        int diasMes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int i; // índice ou subscrito
        for (i=0; i<12; i++) {
            System.out.printf("Mês %2d = %10s, tem %d dias.\n", (i+1), mes[i], diasMes[i]);
        }
    }
}
