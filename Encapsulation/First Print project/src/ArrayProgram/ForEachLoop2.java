/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayProgram;

/**
 *
 * @author User
 */
public class ForEachLoop2 {

    public static void main(String[] args) {

        int[] num = {12, 12, 13, 14, 15};
        int sum = 0;
        for (int x : num) {
            sum = sum + x;
        }
        System.out.println("The result: " + sum);
    }
}
