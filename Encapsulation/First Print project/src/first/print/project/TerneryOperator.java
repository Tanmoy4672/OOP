package first.print.project;

import java.util.Scanner;

public class TerneryOperator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, lerge;
        System.out.print("Enter two number:");
        num1 = input.nextInt();
        num2 = input.nextInt();

        lerge = (num1 > num2) ? num1 : num2;

        System.out.println("Larger number:" + lerge);

    }

}
