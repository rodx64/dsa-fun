package dataStructures.Lists;

import java.util.ArrayList;

public class ListTypes {

    public static void main(String[] args) {
        arrayIsObject();
        arrayIsFixed();
    }

    static int[] arr = new int[]{1,2,3,4,5};
    static ArrayList arrList = new ArrayList(); // Dynamic Array


    /**
     *   1. Array is Object in Java
     */
    static void arrayIsObject(){
        System.out.printf("1.1 Array [] é uma instância de Object? -> %b\n", arr.toString() instanceof Object);
        System.out.printf("1.2 ArrayList é uma instância de Object? -> %b\n", arrList instanceof Object);
    }

    /**
     *   2. The array's Length/Size
     *
     *      Static Array has fixed size -> e.g. new int[100];
     *      Dynamic Arrays has dynamic size -> e.g. new ArrayList();
     */

    static void arrayIsFixed(){
        System.out.printf("2.1 Arrays estáticos tem seu tamanho fixado na memória -> %d\n", arr.length);
        System.out.printf("2.2 Arrays dinâmicos tem seu espaço em memória variável -> antes %d ", arrList.size());
        arrList.add(1);
        System.out.printf("depois %d\n", arrList.size());
    }

}
