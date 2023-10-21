package exerciciosNelioAlves.secao10_memoria_arrays_listas.aula98;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aula98 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Juaquina");
        list.add("Zezim");
        list.add("Zezinha");
        list.add(0, "Marco");

        System.out.println("Tamanho da lista: " + list.size());
//        list.remove("Zezinha");
//        list.remove(1);

        for (String  nomes : list) {
            System.out.println(nomes);
        }

        System.out.println("--------------------");
//===============  removendo elementos que atendam a um predicado: ex: elementos que comecem com a letra "M":
        // nao vai imprimir nem Maria nem Marco
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("--------------------");
        System.out.println("Index of: " + list.indexOf("Zezinha"));
        System.out.println("Index of: " + list.indexOf("naoTemNaLista")); /* Vai retonar -1 */


        System.out.println("--------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'Z').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }


        System.out.println("--------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'Z').findFirst().orElse(null);
        System.out.println(name);
    }
}
