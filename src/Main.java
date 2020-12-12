public class Main {

    public static void main(String[] args) {
        unhandled();
        System.out.println();
        optimizationOne();
        System.out.println();
        optimizationTwo();
    }

    private static void unhandled() {
        long start = System.nanoTime();
        int[] C = new int[2];
        int res = 0;
        for (int j = 500000000; j > 0; j--) {
            C[0]++;
            C[0]++;
        }
        C[1] = C[0];
        System.out.println(C[0]);
        System.out.println("Unhandled version: " + (System.nanoTime() - start));
    }

    private static void optimizationOne() {
        long start = System.nanoTime();
        int[] C = new int[2];
        int res = 0;
        for (int j = 500000000; j > 0; j--) {
            res++;
            res++;
        }
        C[1] = C[0] = res;
        System.out.println(C[0]);
        System.out.println("First optimization: " + (System.nanoTime() - start));
    }

    private static void optimizationTwo() {
        long start = System.nanoTime();
        int[] C = new int[2];
        int res = 0;
        for (int j = 500000000; j > 0; j--) {
            res += 2;
        }
        C[1] = C[0] = res;
        System.out.println(C[0]);
        System.out.println("Second optimization: " + (System.nanoTime() - start));
    }
}
