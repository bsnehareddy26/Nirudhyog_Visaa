import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i =0; i < T; i++) {
            int X = sc.nextInt();
            int N = sc.nextInt();
            int rem = X / 10;
            System.out.println(N * rem);
        }
    }
}