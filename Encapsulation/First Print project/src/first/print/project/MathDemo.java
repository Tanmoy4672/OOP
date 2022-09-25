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
public class MathDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber = 3;
        int secondNumber = 2;
        int result;

        int max = Math.max(firstNumber, secondNumber);
        System.out.println("Maximum:" + max);

        int min = Math.min(firstNumber, secondNumber);
        System.out.println("Maximum:" + min);

        int absolute = Math.abs(firstNumber);
        System.out.println("Absolute value:" + absolute);

        int power = (int) Math.pow(secondNumber, firstNumber);
        System.out.println("2 to the power 3:" + power);

        int round = (int) Math.round(8.8);
        System.out.println("Round value:" + round);

        double pi =Math.PI;
        System.out.println("PI value:"+pi);
    }

}
