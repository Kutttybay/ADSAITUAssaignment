package algosAss1;

import java.util.Scanner;

public class Task9 {
    public void problem(){
        System.out.println("You are given numbers“n” and “k”,write the program that\n" +
                "finds Cn\n" +
                "k\n" +
                "(binomial coefficient) using formulaCn\n" +
                "k=Cn−1\n" +
                "k−1\n" +
                "+Cn−1\n" +
                "k where Cn\n" +
                "0=Cn\n" +
                "n=1.\n" +
                "Input : 2 1 \n" +
                "Output : 2 \n" +
                "\n" +
                "Input : 7 3 \n" +
                "Output : 35");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number n : ");
        int n = sc.nextInt();
        System.out.println("Enter number k : ");
        int k = sc.nextInt();
        System.out.println("Answer : " + findBinomialCoefficient(n, k));
    }
    public int findBinomialCoefficient(int n, int k){
        if (k == 0 || n == k){
            return 1;
        }
        else {
            return findBinomialCoefficient(n-1,k-1) + findBinomialCoefficient(n-1,k);
        }
    }
}
