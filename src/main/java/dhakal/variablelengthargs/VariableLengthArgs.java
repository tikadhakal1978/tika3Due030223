/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package dhakal.variablelengthargs;

/**
 *
 * @author tikad
 */
public class VariableLengthArgs {

    public static void main(String[] args) {
       int result1 = product (2,3, 4);
       int result2 = product (5, 6);
       int result3 = product(1);
       System.out.printf("product 2, 3, and 4 is %d%n", result1);
       System.out.printf("product of 5 and 6 is %d%n", result2);
       System.out.printf("product of 1 is %d%n", result3);
    }
public static int product (int...nums){
    int result = 1;
    for (int num:nums){
        result *=num;
        
    }
return result;
}


}
