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
public class FactorialDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, i, fact = 1;
        System.out.print("Enter any integer number:");
        num = input.nextInt();

        for (i = num; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("Fctorial value of" + num + "=" + fact);

    }

}
