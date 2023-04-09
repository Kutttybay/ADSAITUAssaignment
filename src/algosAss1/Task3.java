package algosAss1;

import java.util.Scanner;

public class Task3 {
    /*
    This code checks if the given number "n" is a prime number.
    The function takes two arguments: "n" - the number to be checked, and "div" - the divisor, starting from which we check if the number "n" is prime.
    The function first checks to see if "n" is less than or equal to 2,
    and if it is less than or equal to 2, it returns true if "n" is equal to 2 and false otherwise.
    The function then checks to see if the value of "div * div" is greater than "n",
    and if it is, it returns true, which means that "n" is a prime number.
    Further, if "n" is not evenly divisible by "div", then the function recursively calls itself with the arguments "n" and "div + 1",
    that is, it proceeds to check the next divisor.
    At the end, the function returns the result of calling itself with the new arguments.
    If the number "n" is divisible by all divisors from "2" to "n-1" without a remainder, then the function will return true, otherwise - false.
    */
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
