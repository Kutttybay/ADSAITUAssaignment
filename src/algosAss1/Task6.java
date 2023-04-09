package algosAss1;

import java.util.Scanner;

public class Task6 {
    public void problem(){
        System.out.println("You are given numbers “a” and “n”, write the function that\n" +
                "returns “an\n" +
                "”.\n" +
                "Input : 2 10\n" +
                "Output : 1024 \n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        double a = sc.nextDouble();
        System.out.println("Enter power");
        int n = sc.nextInt();
        double ans = power(a, n);
        System.out.println("Answer : " + ans);
    }
    /*
    The code checks if the power of n is 0, then returns 1, since any number to the zero power is 1.
    If n is negative, then the function uses recursion and returns 1 divided by power(a, -n) to solve the problem with a positive n.
    If n is an even number, then the function uses recursion and returns half of power(a, n/2) multiplied by itself to reduce the number of recursive calls.
    Otherwise, the function uses recursion to call itself with the argument (n - 1), multiplying the current value by a.
    The function continues to call itself recursively until the power of a in n has been calculated.
    */
    public double power(double a, int n){
        if (n == 0){
            return 1;
        }
        else if(n < 0){
            return 1 / power(a, -n);
        }
        else if(n % 2 == 0){
            double halfpower = power(a, n/2 );
            return halfpower * halfpower;
        }
        else {
            return a * power(a, n-1);
        }
    }
}
