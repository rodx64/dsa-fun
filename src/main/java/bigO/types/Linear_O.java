package bigO.types;

// Each value represents one request:  O(n) - Linear  (increases proportionally)
public class Linear_O {

    private static final String nemo = "nemo";
    private static final String[] onlyNemo = {nemo};
    private static final String[] everyone = {"dory", "bruce", "marlin", nemo, "gill", "bloat", "nigel", "squirt", "darla", "hank"};

    // BIG O Rule 1 -> WORST CASE it's what matters because, if nemo on last position, break doesn't matter in this case
    private static final String[] everyoneWorstCase = {"dory", "bruce", "marlin", "gill", "bloat", "nigel", "squirt", "darla", "hank", nemo};
    private static final String[] oceanPals = new String[10000000];

    public static void main(String[] args) {
        findNemo(onlyNemo); // 0.0 ms
        findNemo(everyone); // 0.1 ms
        fillBiggestArray();
        findNemo(oceanPals); // 14 ms
    }


    private static void findNemo(String[] arr) {
        for (int i = 0; i < arr.length; i++) // Searching for a specific value, may be in last position (worst case)
            if (arr[i] == nemo) {
                System.out.println("Found Nemo!");
                break;  // Call break will stop For and make it faster...Only iff not in last position
            }
    }

    private static void fillBiggestArray() {
        for (int i = 1; i < 100; i++) {
            oceanPals[i] = nemo;
        }
    }

}
