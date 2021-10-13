package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char p ='1';
        while(p!='e'){
            System.out.print("Input a number here -> ");
            Scanner scanner = new Scanner(System.in);
            int num1 = scanner.nextInt();
            System.out.print("Input the second number here -> ");
            int num2 = scanner.nextInt();
            System.out.print("Choose the operation -> ");
            p = scanner.next().charAt(0);
            switch (p) {
                case '+' -> System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
                case '-' -> System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
                case '/' -> System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
                case '*' -> System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
                case '^' -> System.out.printf("%d ^ %d = %f\n", num1, num2, Math.pow(num1, num2));
                //default -> System.out.print("You did not choose the operation");
        }
        }
        System.out.println("You have closed the application");
    }
}
