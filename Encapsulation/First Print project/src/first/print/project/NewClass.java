package first.print.project;

import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {   //psvm ,then tab
        Scanner input = new Scanner(System.in);
        int number1, number2;
        float multi;

        System.out.print("Enter first number :");
        number1 = input.nextInt();
        System.out.print("Enter second number :");
        number2 = input.nextInt();

        System.out.println("The summation of two number is = " + (number1 + number2));
        System.out.println("Subtruction of two number is = " + (number1 - number2));
        //multi =input.nextFloat();
        System.out.println("Multiplication of two number is = " + number1 * number2);
        multi = (float)number1 / number2;
        System.out.println("Division of two number is = " + multi);
        System.out.println("Reminder of two number is = " + (number1 % number2));

    }

}
