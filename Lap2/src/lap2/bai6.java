/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap2;

/**
 *
 * @author Administrator
 */
import javax.swing.JOptionPane;

public class bai6 {
    public static void main(String[] args) {
        int n;
        try{
            n= Integer.parseInt(JOptionPane.showInputDialog(null,"Nhap so nguyen :"));
            //Nhập vào số nguyên n bất kì và kiểm tra điều kiện nó có phải số nguyên hay không
        }
        catch(java.lang.NumberFormatException el)
            //Kiểm tra nếu không phải số nguyên 
        {
            System.out.println(el.toString());
            //Xuất ra lỗi không phải là số nguyên và in ra cái vừa nhập " For input string:" + caivuanhap
        }
        finally{
            System.out.println("Have good fun");
            //Xuất ra màn hình câu "Have goof fun "

        }
    }
}
