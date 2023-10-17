import Lab1.*;
import Lab3.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Chose one operation 1 - 3:");
            System.out.println("1.Lab1");
            System.out.println("2.Lab3");
            System.out.println("3.Exit");
            int x = sc.nextInt();
            if (x == 1) {
                System.out.println("Lab1");
                Array.lab1();
            } else if (x == 2) {
                System.out.println("Lab3");
                Lab3.lab3();
            } else if (x == 3) {
                System.out.println("Program has been stopped");
                break;
            } else {
                System.out.println("Enter correct 1 - 3");
            }
        }
        sc.close();
    }
}
