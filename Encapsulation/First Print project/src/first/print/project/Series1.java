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
public class Series1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum1 = 0, sum2 = 0, sum3 = 0,sum4=0,i;

        System.out.print("Enter n value:");
        n = input.nextInt();
     

        System.out.print("The series is(incrsing->1+):");
        for (i = 1; i <= n; i = i + 1) {
            System.out.print(i + " ");
            sum1 = sum1 + i;
        }
        System.out.println("....." + sum1);

        System.out.println();
        System.out.print("The series is(increasing->2+):");
        for (i = 1; i <= n; i = i + 2) {
            System.out.print(i + " ");
            sum2 = sum2 + i;
        }
        System.out.println("....." + sum2);

        System.out.println();
        System.out.print("The series is(even series->2+):");
        for (i = 2; i <= n; i = i + 2) {
            System.out.print(i + " ");
            sum3 = sum3 + i;
        }
        System.out.println("....." + sum3);
        
        
    }

}
