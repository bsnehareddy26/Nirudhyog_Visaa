import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        //Case 1 -- %
        double min_1 = X * 0.1;
        int disc = Math.min(X, 100);
        //Case 2 --- -100
        int min_2 = 100;
        double max_amount = Math.max(min_1, min_2);
        System.out.println((int)(X - max_amount));
    }
}
