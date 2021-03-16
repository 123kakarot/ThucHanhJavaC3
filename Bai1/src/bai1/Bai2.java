/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai2 {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner x= new Scanner(System.in);
        System.out.println("Nhap ma sinh vien");
        String masv= x.nextLine();
        System.out.println("Nhap ho ten sinh vien");
        String hoten= x.nextLine();
        System.out.println("Nhap tuoi sinh vien");
        String tuoi= x.nextLine();
        System.out.println("Nhap nam sinh sinh vien");
        String namsinh= x.nextLine();
        System.out.println("Nhap diem tring binh sinh vien");
        String dtb= x.nextLine();
        System.out.println("Ma sinh vien :" + masv + "\nHo ten sinh vien :" + hoten + "\nTuoi sinh vien :" + tuoi
        + "\nNam sinh sinh vien :" + namsinh+ "\nDiem trung binh sinh vien :" + dtb);
    }
    
}
