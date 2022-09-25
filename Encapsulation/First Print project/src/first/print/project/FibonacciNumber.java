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
public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many number:");
        int choiceNum=input.nextInt();
        
        int first=0;
        int second =1;
        int fibo;
        
        System.out.print(first+","+second);
        
        for (int i = 3; i <=choiceNum; i++) {
            fibo=first+second;
            System.out.print(" "+fibo);
            first=second;
            second=fibo;
        }
        System.out.println();
    }
    
}
