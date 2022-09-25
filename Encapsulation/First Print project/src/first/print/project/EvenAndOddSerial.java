package first.print.project;

import java.util.Scanner;

public class EvenAndOddSerial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m, sum = 0, i;

        System.out.print("Enter first number:");
        n = input.nextInt();
        System.out.print("Enter n number:");
        m = input.nextInt();

        for (i = n; i <= m; i++) {
            if (i % 2 == 0) {
                System.out.print(" " + i);
                sum = sum + i;

            }

        }
        System.out.println();
        System.out.println("The sum is " + sum);
    }

}
