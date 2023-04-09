package algosAss1;

import java.util.Scanner;

public class Task7 {
    /*
    The code checks if n (the number of elements in the array) is 0, then returns the first element of the array arr[0],
    since it is the last element in reverse order.
    Otherwise, the function prints the current array element arr[n-1] using Sout and calls itself with an argument (n-1) to
    continue printing the array elements in reverse order.
    The function continues to call itself recursively until all elements of the array have been printed in reverse order.
    */
    public int reversedNumbers(int n, int[] arr){
        if (n == 0){
            return arr[0];
        }
        else{
            System.out.print(arr[n-1] + " ");
            return reversedNumbers(n-1, arr);
        }
    }
    public void problem(){
        System.out.println("You are given a number “n” and an array of “n” elements,\n" +
                "write the program that returns given array in reverse order\n" +
                "without using array data structure.\n" +
                "Input : 4 \n" +
                "        1 4 6 2 \n" +
                "Output : 2 6 4 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter sequence");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Reversed sequence : ");
        reversedNumbers(n, arr);
        System.out.println();
    }
}
