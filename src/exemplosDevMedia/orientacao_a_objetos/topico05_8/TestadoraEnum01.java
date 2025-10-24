package exemplosDevMedia.orientacao_a_objetos.topico05_8;

public class TestadoraEnum01 {
    public static void main(String[] args) {
        MarcasEnum amazon = MarcasEnum.AMAZON;
        MarcasEnum dell = MarcasEnum.DELL;
        MarcasEnum hp = MarcasEnum.HP;
        MarcasEnum toshiba = MarcasEnum.TOSHIBA;
        MarcasEnum lg = MarcasEnum.LG;
        MarcasEnum samsung = MarcasEnum.SAMSUNG;
        System.out.println("Nome da Marca = "+amazon.name());
        System.out.println("Nome da Marca = "+dell.name());
        System.out.println("Nome da Marca = "+hp.name());
        System.out.println("Nome da Marca = "+toshiba.name());
        System.out.println("Nome da Marca = "+lg.name());
        System.out.println("Nome da Marca = "+samsung.name());
    }
}
    