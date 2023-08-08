package setup.bigO.rules;

public class Rule1_WorstCase {

    /**
     *     BIG O
     *     RULE 1 - WORST CASE
     *
     *     Deve-se considerar sempre o pior cenário, ou seja, encontrar o valor apenas na última posição
     *
     *     Ω (Omega)     -> primeiro valor de um array  (BEST CASE)
     *     Θ (Teta)      -> valor mediano de um array   (AVERAGE CASE)
     *     Ο (Omicron)   -> Último valor de um array, por isso é chamado de BigO, por considerarmos sempre o (WORST CASE)
     */

    private static String[] everyoneWorstCase = {"best", "bruce", "marlin", "gill", "average", "nigel", "squirt", "darla", "hank", "worst"};

    public static void main(String[] args) {
        findWorstCase(everyoneWorstCase);
    }

    private static void findWorstCase(String[] arr) {
        for (int i = 0; i < arr.length; i++)
            if(arr[i].equalsIgnoreCase("worst")) {
                System.out.println("Found Worst!");
                break;
            }
    }

}
