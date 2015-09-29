package problems1to10;

/**
 * Solution to Project Euler problem 1
 * Created by andrey_v.v on 27.09.15.
 */

public class problem1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                sum += i;
        }
        System.out.println(sum);
    }
}



