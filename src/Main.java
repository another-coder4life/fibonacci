public class Main {
    public static long[] getFibonacciNumbers(int n) {
        long[] fibNumbers = new long[n];

        fibNumbers[0] = 0;
        fibNumbers[1] = 1;

        for (int i = 2; i < n; ++i) {
            fibNumbers[i] = fibNumbers[i - 2] + fibNumbers[i - 1];
        }

        return fibNumbers;
    }

    public static void main(String[] args) {
        int n = 10;

        long[] fibNumbers = getFibonacciNumbers(n);

        for (int i = 0; i < n; i++) {
            System.out.println(Long.toUnsignedString(fibNumbers[i]) + " ");
        }
    }
}