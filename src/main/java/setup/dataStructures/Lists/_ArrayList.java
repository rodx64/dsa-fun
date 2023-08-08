package setup.dataStructures.Lists;

import java.util.ArrayList;
import java.util.List;

public class _ArrayList {

    public static void main(String[] args) {
        bigOInOperations();
    }
    static List<Integer> arrList = new ArrayList(); // Dynamic Array

    public static void bigOInOperations(){
        arrList.add(0); // O(1)
        arrList.add(1); // O(1)
        arrList.add(2); // O(1)
        arrList.add(3); // O(1)
        arrList.add(4); // O(1)
        System.out.println(arrList);

        // Removendo o último da lista, pois não necessita reposicionar indices.
        arrList.remove(4); // O(1)
        System.out.println(arrList);

        // Removendo o primeiro de uma lista, deve-se reposicionar os indices dos demais.
        // Assim, tocando em cada um deles, temos O(n)
        arrList.remove(0); // O(n)
        System.out.println(arrList);

        // Adicionando o primeiro de uma lista, deve-se reposicionar os indices dos demais.
        // Assim, tocando em cada um deles, também temos O(n)
        arrList.add(0, 11);
        System.out.println(arrList);

        // Buscar deve-se tocar todos os items
        System.out.println(arrList.contains(11)); // O(n)
        System.out.println(arrList);
    }


}
