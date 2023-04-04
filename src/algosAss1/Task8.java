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
