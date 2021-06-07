package iteris.minishop.util;

// 1 1 2 3 5 8 13
public class FibonacciCalculator {

    private static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    private static int fib2(int n) {
        int f[] = new int[n+2];
        int i;
        
        f[0] = 0;
        f[1] = 1;
        
        for (i = 2; i <= n; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        
        return f[n];
    }
      
    public static void main(String args[]) {
        int n = 7;
        System.out.println(fib2(n));
    }
}
