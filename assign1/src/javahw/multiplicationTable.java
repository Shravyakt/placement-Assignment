package javahw;

import java.util.Scanner;

public class multiplicationTable {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        System.out.println("multiplication table" + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "X" + i + "=" + (number * i));

        }

    }

}
