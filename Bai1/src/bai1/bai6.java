/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import static bai1.bai5.isPrimeNumber;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai6 {
     public  static boolean laSoNguyenTo(int n)
    {
         if (n == 1) return false;
         for (int i = 2; i <= Math.sqrt (n); i ++)
              if (n% i == 0) return false;
         return true;
    }
      static boolean checkPerfectSquare(int x)
    {
        double sq = Math.sqrt(x);
        return ((sq - Math.floor(sq)) == 0);
    }
    public static void main(String[] args) {
    int n, sum = 0, tempSort;
    Scanner scanner = new Scanner(System.in);
         
    do {
        System.out.println("Nhập vào số phần tử của mảng: ");
        n = scanner.nextInt();
    } while (n < 0);
         
    // khởi tạo và cấp phát bộ nhớ cho mảng
    int array[] = new int[n];
         
    System.out.println("Nhập các phần tử cho mảng: ");
    for (int i = 0; i < n; i++) {
        System.out.print("Nhập phần tử thứ " + i + ": ");
        array[i] = scanner.nextInt();
    }
         
    // Hiển thị mảng vừa nhập
    System.out.println("\nMảng ban đầu: ");
    for (int i = 0; i < n; i++) {
        System.out.print(array[i] + "\t");
    }
         
    //Xuất các phần tử là nguyên tố
     System.out.println("\nTất cả số nguyên tố là: ");
     for (int i = 0; i <n; i ++)
     {
          if (laSoNguyenTo(array[i])==true ) 
          {
              System.out.print("\t"+array[i]);
          }
     }
     //Tìm phần tử lớn nhất trong mảng.
     int maxValue = array[0];
     for (int i = 1; i < n; i++) {
			if (array[i] > maxValue) {
				maxValue = array[i];
			}
		}
     System.out.println("\nPhần tử lớn nhất trong mảng :"+ maxValue);
    //Đếm các phần tử là số chính phương
     System.out.println("Cac so chinh phuong thoa man:");

            for(int i=0; i<n; i++) {

                     if (checkPerfectSquare(array[i])) {
				System.out.print("\t" +array[i]);
			} 
            }
    //Đếm các phần tử là số chính phương

    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j <= n - 1; j++) {
            if (array[i] > array[j]) {
                tempSort = array[i];
                array[i] = array[j];
                array[j] = tempSort;
            }
        }
    }
    System.out.println("\nMảng sau khi sắp xếp là theo thứ tự tăng dần là: ");
    for (int i = 0; i < n; i++) {
        System.out.print(array[i] + "\t");
    }
}
}
