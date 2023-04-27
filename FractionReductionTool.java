public class Main {
    public static void main(String[] args) {
        int n = 24;
        int d = 12;

        System.out.println("Before reduction: " + n + "/" + d);

        int[] reducedFraction = reduce(n, d);
        n = reducedFraction[0];
        d = reducedFraction[1];

        System.out.println("After reduction: " + n + "/" + d);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int[] reduce(int n, int d) {
        int divisor = gcd(n, d);
        n /= divisor;
        d /= divisor;
        return new int[] { n, d };
    }
}