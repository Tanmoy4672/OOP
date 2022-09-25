 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first.print.project;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any positive number");
        int num = input.nextInt();
        int count = 0;

        for (int i = 1; i < num; i++) {

            if (num % 2 == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number.");
        }
    }

}
