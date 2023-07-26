package bigO.rules;

public class Rule1 {

    /**
     *     BIG O
     *     RULE 1 - WORST CASE
     *
     *     Pegando exemplo durante a busca em Arrays, deve-se considerar sempre o pior cenário, ou seja, encontrar o valor apenas na última posição
     *     Ou seja, mesmo utilizando o Break, não seria possível sair antes do final.
     */

    private static String[] everyoneWorstCase = {"dory", "bruce", "marlin", "gill", "bloat", "nigel", "squirt", "darla", "hank", "worst"};

    public static void main(String[] args) {
        searching(everyoneWorstCase); // 14 ms
    }


    private static void searching(String[] arr) {
        for (int i = 0; i < arr.length; i++)
            if(arr[i] == "worst") {
                System.out.println("Found Worst!");
                break;
            }
    }

}
