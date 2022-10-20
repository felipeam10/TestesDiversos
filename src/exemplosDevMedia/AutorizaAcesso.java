package exemplosDevMedia;

public class AutorizaAcesso {

    public boolean podeAcessar(int idUsuarioLogado, int idDono, boolean ehAdmin){
        return idUsuarioLogado == idDono || ehAdmin;
    }
}
