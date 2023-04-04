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
