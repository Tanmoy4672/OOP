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
public class Array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] number = new double[5];
        double sum = 0;
        double max = number[0];
        double min = number[0];
        System.out.print("Please entre 5 numbers:");

        for (int i = 0; i < 5; i++) {
            number[i] = input.nextDouble();
            sum = sum + number[i];

        }
        System.out.println("The result= " + sum);
        //  double avg = sum / 5;
        double avg = sum / number.length;
        System.out.println("The average= " + avg);

        for (int i = 1; i < 5; i++) {
            if (max < number[i]) {
                max = number[i];
            }
            if (min > number[i]) {
                min = number[i];
            }
        }
        System.out.println("Maximum" + max);
        System.out.println("Minimum" + min);
    }

}
