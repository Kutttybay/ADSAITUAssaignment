package algosAss1;

import java.util.Scanner;

public class Task2 {
    public void problem(){
        System.out.println("You are given a number “n” and an array of “n” elements,\n" +
                "write the function that returns average of them. \n" +
                "Input : \n" +
                "4 \n" +
                " 3 2 4 1  \n" +
                "Output : \n" +
                "2.5 \n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter sequences");
        for (int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }
        double average = getAverage(arr);
        System.out.println("The average is " + average);
    }
    /*
    initialize the "sum" variable to 0.0.
    then use a "for" loop to loop through all the elements in the "arr" array and add each element to "sum".
    after all we return value what sum divide by array length
    */
    public static double getAverage(int[] arr) {
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
