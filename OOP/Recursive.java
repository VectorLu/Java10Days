public class Recursive {
    public static int fn(int n) {
        if (n == 0) {
            return 1;
        }
        else if (n == 1) {
            return 4;
        }
        else {
            return (2*fn(n-1) + fn(n-2));
        }
    }

    public static int fn1(int n) {
        if (n == 20) {
            return 1;
        }
        else if (n == 21) {
            return 4;
        }
        else {
            return (fn1(n+2) - 2*fn1(n+1));
        }
    }

    public static void main(String[] args) {
        System.out.println(fn(10));
        System.out.println(fn1(10));

    }
}
