package problems1to10;

/**
 * Solution to Project Euler problem 1
 * Created by andr on 27.09.15.
 */
public class problem3 {

    public static void main(String[] args) {


        long n = 600851475143L;
        while (true) {
            long p = smallestFactor(n);
            if (p < n)
                n /= p;
            else
                break;
                System.out.println(n);

        }

    }

        private static long smallestFactor(long n) {
            if (n <= 1)
                throw new IllegalArgumentException();
            for (long i = 2, end = (long)Math.sqrt(n); i <= end; i++) {
                if (n % i == 0)
                    return i;
            }
            return n;  // n itself is prime
        }



    }






