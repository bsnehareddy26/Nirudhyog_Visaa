import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long gym = sc.nextLong();
        long trainer = sc.nextLong();
        long budget = sc.nextLong();
        long cost = gym + trainer;
        if(budget >= cost) {
            System.out.println("2");
        }
        else if(budget >= gym){
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}
