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
public class SumOfDiagonal_upper_lower {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] A = new int[3][3];
        int sumOfDiagonal = 0;
        int sumOfUpperValue = 0;
        int sumOfLowerValue = 0;

        //data taking
        System.out.println("Taking value of A: ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("Enter value for A[%d][%d] :", row, col);
                A[row][col] = input.nextInt();
            }
        }
        
        //printing A matrix
        System.out.print("A=");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t " + A[row][col]);
            }
            System.out.println();
        }

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row == col) {
                    //sum of diagonal
                    sumOfDiagonal = sumOfDiagonal + A[row][col];
                }
                if (row < col) {
                    //sum of upper
                    sumOfUpperValue = sumOfUpperValue + A[row][col];
                }
                if (row > col) {
                    //sum of lower
                    sumOfLowerValue = sumOfLowerValue + A[row][col];
                }
            }
        }

        System.out.println("Sum of diagonal:" + sumOfDiagonal);
        System.out.println("Sum of upper value:" + sumOfUpperValue);
        System.out.println("Sum of lower value:" + sumOfLowerValue);
    }

}
