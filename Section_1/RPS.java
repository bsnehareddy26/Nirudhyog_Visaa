import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] m = input.split(" ");
        char V = m[0].charAt(0);
        char C = m[1].charAt(0);
        if (V == C) {
            System.out.println("NULL");
        }
        else if((V == 'R' && C == 'S') || (V == 'P' && C == 'R') || (V == 'S' && C == 'P')) {
            System.out.println("Vignesh");
        }
        else {
            System.out.println("Charan");
        }
        
    }
}
