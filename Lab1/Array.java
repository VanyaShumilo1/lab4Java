package Lab1;

import java.util.Scanner;

public class Array {
    public static void lab1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter quantity of elements: ");
        int SIZE = sc.nextInt();

        if (SIZE <= 0) {
            System.out.println("Quantity must by at least 1");
            return;
        }

        int[] arr = new int[SIZE];
        int sum = 0;
        int mul = 1;

        System.out.println("Enter the elements (Separated by enter)");

        for (int i = 0; i < SIZE; i++) {
            arr[i] = sc.nextInt();
            if (i % 2 == 1) {
                mul *= arr[i];
            }
            sum += arr[i];
        }

        System.out.println("Sum: " + sum);
        System.out.println("Mult: " + mul);
    }
}
