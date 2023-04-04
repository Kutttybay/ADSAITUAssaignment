package algosAss1;

import java.util.Scanner;

public class Task4 {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public void problem(){
        System.out.println("You are given a number “n”, write the program using recursion for\n" +
                "finding “n!” \n" +
                "Input : 5 \n" +
                "Output : 120 \n");
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = factorial(n);
        System.out.println("Factorial : " + ans);
    }
}
