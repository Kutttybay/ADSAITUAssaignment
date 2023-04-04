package algosAss1;

import java.util.Scanner;

public class Task3 {
    public boolean is_Prime(int n, int div){
        if (n <= 2){
            return n == 2;
        }
        if (div * div > n){
            return true;
        }
        if (n % div == 0){
            return false;
        }
        return is_Prime(n , div + 1);
    }
    public void problem(){
        System.out.println("You are given a number “n”, write the function for checking\n" +
                "whether“n” is prime.\n" +
                "Input : 7\n" +
                "Output : Prime\n" +
                "\n" +
                "Input : 10 \n" +
                "Output : Composite");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        if (is_Prime(n, 2)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Composite");
        }
    }
}
