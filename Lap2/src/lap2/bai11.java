/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai11 {

    public static boolean isNumeric(String str) {
	return str.matches("-?\\d+(\\.\\d+)?");
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\DO_AN\\test.txt";
        // Đọc dữ liệu từ File với Scanner
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        int total = 0;
        
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            if (isNumeric(s)){
                total += Integer.parseInt(s);
                }
            }
            System.out.println(total);
    }
    
}