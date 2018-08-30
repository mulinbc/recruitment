package exam._4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Solution solution = new Solution();
        System.out.println(solution.add(a, b));
        
        sc.close();
    }
}

class Solution {
    public int add(int a, int b) {
        int ret = 0;
        ret = a + b;
        return ret;
    }
}