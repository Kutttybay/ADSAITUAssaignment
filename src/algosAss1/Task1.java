package algosAss1;

import java.util.Scanner;

public class Task1 {
    /*
    Input length for array, and sequences
    call method getMin
    Init. new values min what equals first array number
    Start loop for what stop when i will be less than array length
    loop have if statement , if array number of i will be less than min value, min value will be equals to arr[i]
    after loop , and statement success
    return min value
    */
    public int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public void problem(){
        System.out.println("You are given a number “n” and an array of “n” elements,\n" +
                "write the function that returns minimum of them. \n" +
                "Input: " +
                "5" +
                "10 1 32 3 45" +
                "Output: " +
                "1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter sequences");
        for (int i = 0; i < a;i++){
            arr[i] = sc.nextInt();
        }
        int min = getMin(arr);
        System.out.println("The minimun number is : " + min);
    }
}
