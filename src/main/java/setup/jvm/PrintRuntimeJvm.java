package setup.jvm;

public class PrintRuntimeJvm {

    public static void main(String[] args) {
        print();
    }

    static void print(){
        Runtime runtime = Runtime.getRuntime();

        // Total system memory available to the JVM
        // -> Setup: -Xmx, e.g. -Xmx5g increase max to 5gb
        System.out.println("Max mem: " +  toMb(runtime.maxMemory()) + " mb");

        // HEAP memory reserved for use (Increases on demand)
        // -> Setup: -Xms, e.g. -Xms3g (starts reserved mem with 3gb)
        System.out.println("Reserved mem: " + toMb(runtime.totalMemory()) + " mb");

        // HEAP memory free to use
        System.out.println("Free mem: " + toMb(runtime.freeMemory()) + " mb");

        // Number of processors available
        System.out.println("Processors available: " + runtime.availableProcessors());
    }

    static long toMb(long val){
        return val / 1024 / 1024;
    }
}
