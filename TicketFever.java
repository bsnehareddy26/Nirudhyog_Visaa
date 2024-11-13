import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
        int N = sc.nextInt();
        int M = sc.nextInt();
        if (N > M) {
            System.out.println(N-M);
        }
        else if (M > N) {
            System.out.println(0);
        }
        else {
            System.out.println("0");
        }
    }
    }
}
