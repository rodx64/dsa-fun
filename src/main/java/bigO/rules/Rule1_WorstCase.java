package bigO.rules;

public class Rule1_WorstCase {

    /**
     * BIG O
     * RULE 1 - WORST CASE
     * You must always consider the worst case scenario, that is, finding the value only in the last position
     * Ω (Omega)     -> First value of an array  (BEST CASE)
     * Θ (Teta)      -> Medium value of an array  (AVERAGE CASE)
     * Ο (Omicron)   -> Last value of an array, which is why it is called BigO (WORST CASE)
     */
    public static void main(String[] args) {
        findWorstCase(everyoneWorstCase);
    }

    private static String[] everyoneWorstCase = {"best", "bruce", "marlin", "gill", "average", "nigel", "squirt", "darla", "hank", "worst"};

    private static void findWorstCase(String[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i].equalsIgnoreCase("worst")) {
                System.out.println("Found Worst!");
                break;
            }
    }

}
