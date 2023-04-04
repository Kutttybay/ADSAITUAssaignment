package algosAss1;

import java.util.Scanner;

public class Task5 {
    public void problem(){
        System.out.println("You are given a number “n”, write the function for finding n-th\n" +
                "elements in Fibonacci sequence using recursion. (Fn = Fn-1+ Fn-2).\n" +
                "F0= 0, F1 = 1. \n" +
                "Input : 5 \n" +
                "Output : 5 \n" +
                "\n" +
                "Input : 17 \n" +
                "Output : 1597 \n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int ans = fibonacci(n);
        System.out.println("Fibonacci number : " + ans);
    }
    public int fibonacci(int n){
        if (n == 0){
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
