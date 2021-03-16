/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author Administrator
 */
public class bai3 {

   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner x= new Scanner(System.in);
        DecimalFormat nguyen = new DecimalFormat("#.##");
        System.out.println("Nhap so nguyen a");
        int a= x.nextInt();
        System.out.println("Nhap so nguyen b");
        int b= x.nextInt();  
        int tong=a+b;
        int hieu=a-b;
        int tich=a*b;
        float thuong=(float)a/b;
        System.out.println("Tong la :" +tong);
         System.out.println("Hieu la :" +hieu);
         System.out.println("Tich la :" +tich);
         System.out.println("Thuong la :" +nguyen.format(thuong));
    }
    
}
