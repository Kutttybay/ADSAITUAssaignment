package algosAss1;

import java.util.Scanner;

public class Task8 {
    public void problem(){
        System.out.println("You are given a string “s”, write the function for checking\n" +
                "whether “s” is all consists of digits.\n" +
                "Input : 123456 \n" +
                "Output : Yes\n" +
                "\n" +
                "Input : 123a12\n" +
                "Output : No");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String a = sc.nextLine();
        if (isAllDigits(a)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    /*
    The code checks if the string a is null or empty, then returns false, since an empty string cannot consist only of digits.
    Otherwise, the function will iterate through all the characters in the string using a for loop,
    and check if each character is a digit using the Character.isDigit method.
    If at least one character is not a digit, the function will return false.
    If all characters are digits, then the function will return true.
    */
    public boolean isAllDigits(String a){
        if (a == null || a.isEmpty()){
            return false;
        }
        for (char c : a.toCharArray()){
            if (!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
}
