/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Administrator
 */
public class bai3 extends javax.swing.JFrame {
    private  static final long serialVersionUID = 1L;
    
   
    public bai3(String title) {
        setTitle(title);
        JPanel pnFlow= new JPanel();
        pnFlow.setLayout(new FlowLayout());
        pnFlow.setBackground(Color.pink);
        JButton btn11 = new JButton("FlowLayout");
        JButton btn12 = new JButton("add các control");
        JButton btn13 = new JButton("Trên 1 dòng");
        JButton btn14 = new JButton("Hết chỗ chứa");
        JButton btn15 = new JButton("Thì xuống dòng");
        pnFlow.add(btn11);
        pnFlow.add(btn12);
        pnFlow.add(btn13);
        pnFlow.add(btn14);
        pnFlow.add(btn15);
        Container con = getContentPane();
        con.add(pnFlow);
        
    }

    public static void main(String args[]) {
        bai3 b3= new bai3("Demo Flowlayout");
        b3.setSize(600,100);
        b3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b3.setLocationRelativeTo(b3);
        b3.setVisible(true);
    }

          
}
