/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.pkg21;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Pham Minh Hai
 */
public class Calculator extends JFrame {
    private JLabel lblFirst, lblSecond, lblResult;
    private JTextField txtFirst, txtSecond, txtResult;
    private JButton btnClear, btnAdd, btnSub, btnMul, btnDiv;

    public Calculator(String title) {
        this.setTitle(title);
        lblFirst = new JLabel("First Number");
        lblSecond = new JLabel("Second Number");
        lblResult = new JLabel("Result");
        this.add(lblFirst);
        this.add(lblSecond);
        this.add(lblResult);
        lblFirst.setBounds(50, 50, 100, 30);
        lblSecond.setBounds(50, 100, 100, 30);
        lblResult.setBounds(50, 150, 100, 30);
        
        this.setSize(500, 500);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
    
    
}
