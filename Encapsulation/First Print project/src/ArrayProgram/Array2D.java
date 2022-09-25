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
public class Array2D {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] number = new int[2][3];
        
        

        number[0][0]=2;
        number[0][1]=3;
        number[0][2]=2;
        number[1][0]=2;
        number[1][1]=2;
        number[1][2]=2;
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                //boolean Nrow;
                System.out.print(" "+number[row][col]);
            }
            System.out.println();
        }

    }

}
