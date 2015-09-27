package problems1to10;

/**
 * Solution to Project Euler problem 1
 * Created by andr on 27.09.15.
 */
public class problem2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; ; i++) {
            int fib = fibonacci(i);
            if (fib > 4000000)
                break;
            if (fib % 2 == 0)
                sum += fib;
        }
        System.out.println(sum);
    }
    public static int fibonacci(int x) {
        if (x < 0 || x > 46)
            throw new IllegalArgumentException();
        int a = 0;
        int b = 1;
        for (int i = 0; i < x; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return a;
    }

    
}
