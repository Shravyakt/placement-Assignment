package javahw;

import java.util.Scanner;

public class JavaHW {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number:");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("given number is positive");

        } else if (number < 0) {
            System.out.println("given number is negative");
        } else {
            System.out.println("given number is Zero");
        }
    }

}
