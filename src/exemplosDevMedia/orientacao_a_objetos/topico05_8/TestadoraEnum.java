package exemplosDevMedia.orientacao_a_objetos.topico05_8;

public class TestadoraEnum {
    public static void escolheOpcao(OpcoesMenu opcao){
        if(opcao == OpcoesMenu.SALVAR){
            System.out.println("Salvando o arquivo!");
        }
        else if(opcao == OpcoesMenu.ABRIR){
            System.out.println("Abrindo o arquivo!");
        }
    }

    public static void main(String[] args) {
        escolheOpcao(OpcoesMenu.SALVAR);
    }
}
