package algosAss1;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        boolean tf = true;
        while(tf) {
            System.out.println("Welcome, you in Assignment 1 \n" +
                    "What task do you want to check (1 - 10) ?\n" +
                    "Press 0 to quit ");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            switch (a){
                case 0:
                    tf = false;
                    break;
                case 1:
                    Task1 task1 = new Task1();
                    task1.problem();
                    break;
                case 2:
                    Task2 task2 = new Task2();
                    task2.problem();
                    break;
                case 3:
                    Task3 task3 = new Task3();
                    task3.problem();
                    break;
                case 4:
                    Task4 task4 = new Task4();
                    task4.problem();
                    break;
                case 5:
                    Task5 task5 = new Task5();
                    task5.problem();
                    break;
                case 6:
                    Task6 task6 = new Task6();
                    task6.problem();
                    break;
                case 7:
                    Task7 task7 = new Task7();
                    task7.problem();
                    break;
                case 8:
                    Task8 task8 = new Task8();
                    task8.problem();
                    break;
                case 9:
                    Task9 task9 = new Task9();
                    task9.problem();
                    break;
                case 10:
                    Task10 task10 = new Task10();
                    task10.problem();
                    break;
            }
        }
    }
}
