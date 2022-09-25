/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayProgram;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class makeElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];

        //geting A input
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("Enter value for A[%d][%d] :", row, col);
                A[row][col] = input.nextInt();
            }
        }

        System.out.println();
        //geting B input
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("Enter value for B[%d][%d] :", row, col);
                B[row][col] = input.nextInt();
            }
        }

        //printing A matrix
        System.out.print("A=");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t " + A[row][col]);
            }
            System.out.println();
        }

        //printing B matrix
        System.out.print("B=");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t " + B[row][col]);
            }
            System.out.println();
        }

        //adding A & B matrix
        System.out.println("Summation=");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" " + (A[row][col] + B[row][col]));
            }
            System.out.println();
        }

    }
}
