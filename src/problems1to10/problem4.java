package problems1to10;

/**
 * Solution to Project Euler problem 4
 * Created by andrey_v.v on 27.09.15.
 */
public class problem4 {
    //
public static void main (String [] args) {
    int max=0;
    for(int i=100;i<=999;i++)

    {


        for (int j = 100; j <= 999; j++) {


            if (palin(j * i)) {
                if (j * i > max)
                    max = j * i;
            }
        }
    }
    System.out.println(max);
}


    public static long rev(long n)
    { // This method simply returns a reversed number

        String s=""+n;
        StringBuffer sb=new StringBuffer(s);
        sb=sb.reverse();
        s=""+sb;

        return Long.parseLong(s);
    }

    public static boolean palin(int n)
    {  //This method checks if a number is palin or no

        String s1=""+n;
        String s2=""+rev(n);
        if(s1.equals(s2))
            return true;

        return false;
    }

}
