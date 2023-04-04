package algosAss1;

import java.util.Scanner;

public class Task10 {
    public int findGCD(int a, int b){
        if (b == 0){
            return a;
        }
        else {
            return findGCD(b, a % b);
        }
    }
    public void problem(){
        System.out.println("You are given “a” and “b”, write the function for finding\n" +
                "GCD(a, b) using recursion. (Hint: Euclidean Algorithm)\n" +
                "Input : 32 48 \n" +
                "Output : 16 \n" +
                "\n" +
                "Input : 10 7\n" +
                "Output : 1\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();
        int ans = findGCD(a,b);
        System.out.println("Answer : " + ans);
    }
}
