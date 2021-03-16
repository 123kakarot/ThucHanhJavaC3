/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai2 {

    public static boolean laSoNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập n = ");
        int n = scanner.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            double randomDouble = Math.random();
            randomDouble = randomDouble * 100 + 1;
            array[i] = (int) randomDouble;
            System.out.println("Random number is : " + array[i]);
        }
        
        System.out.println("\nTất cả số nguyên tố là: ");
        for (int i = 0; i < n; i++) {
            if (laSoNguyenTo(array[i]) == true) {
                System.out.print("\t" + array[i]);
            }
        }
    }

}
