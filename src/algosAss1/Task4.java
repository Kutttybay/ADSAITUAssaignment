package algosAss1;

import java.util.Scanner;

public class Task4 {
    /*
    The code checks if the number n is 0, then returns 1, since the factorial of 0 is 1.
    Otherwise, the function uses recursion to call itself with the argument (n - 1), multiplying the current value by n.
    The function continues to call itself recursively until n is 0 and returns the product of all numbers from 1 to the original value of n.
    */
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
