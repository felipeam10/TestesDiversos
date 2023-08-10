package exemplosDevMedia.exemplos_OLD;

public class AutorizaAcesso {

    public boolean podeAcessar(int idUsuarioLogado, int idDono, boolean ehAdmin){
        return idUsuarioLogado == idDono || ehAdmin;
    }
}
