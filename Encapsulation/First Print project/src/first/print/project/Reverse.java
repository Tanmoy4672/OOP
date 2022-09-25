/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first.print.project;

import java.util.Scanner;

//enter: 123
public class Reverse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter any number:");
        num = input.nextInt();
        int r;
        int sum = 0;
        int temp = num;

        while (temp != 0) {
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;
        }
        System.out.println("Reverse number: " + sum);
    }

}
