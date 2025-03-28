/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Pham Minh Hai
 */
public class GUI {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("");
//        frame.setSize(500, 400);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLocationRelativeTo(null);
//        frame.setLayout(null);
//        frame.setVisible(true);
//        
//        JLabel lbl1 = new JLabel("First Number");
//        lbl1.setBounds(50, 50, 100, 30);
//        JLabel lbl2 = new JLabel("Second Number");
//        lbl2.setBounds(50, 100, 100, 30);
//        JLabel lbl3 = new JLabel("Result");
//        lbl3.setBounds(50, 150, 100, 30);
//        frame.add(lbl1);
//        frame.add(lbl2);
//        frame.add(lbl3);
//        
//        JTextField fNumber = new JTextField("");
//        JTextField sNumber = new JTextField("");
//        JTextField res = new JTextField ("");
//        fNumber.setBounds(170, 50, 170, 30);
//        sNumber.setBounds(170, 100, 170, 30);
//        res.setBounds(170, 150, 170, 30);
//        frame.add(fNumber);
//        frame.add(sNumber);
//        frame.add(res);
//        
//        JButton clear = new JButton("CLEAR");
//        clear.setBounds(50, 200, 80, 30);
//        frame.add(clear);
//        clear.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                fNumber.setText("");
//                sNumber.setText("");
//                res.setText("");
//            }
//            
//        });
//        
//        
//        JButton add = new JButton("ADD");
//        add.setBounds(50, 250, 70, 30);
//        frame.add(add);
//        add.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int s1 = Integer.parseInt(fNumber.getText());
//                int s2 = Integer.parseInt(sNumber.getText());
//                res.setText(Integer.toString(s1 + s2));
//            }
//        });
//        
//        JButton sub = new JButton("SUB");
//        sub.setBounds(130, 250, 70, 30);
//        frame.add(sub);
//        sub.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int s1 = Integer.parseInt(fNumber.getText());
//                int s2 = Integer.parseInt(sNumber.getText());
//                res.setText(Integer.toString(s1 - s2));
//            }
//            
//        });
//        
//        JButton mul = new JButton("MUL");
//        mul.setBounds(220, 250, 70, 30);
//        frame.add(mul);
//        mul.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int s1 = Integer.parseInt(fNumber.getText());
//                int s2 = Integer.parseInt(sNumber.getText());
//                res.setText(Integer.toString(s1 * s2));
//            }
//            
//        });
//        
//        JButton div = new JButton("DIV");
//        div.setBounds(310, 250, 70, 30);
//        frame.add(div);
//        div.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int s1 = Integer.parseInt(fNumber.getText());
//                int s2 = Integer.parseInt(sNumber.getText());
//                double s3 = (double)s1 / s2;
//                if (s3 == (int)s3){
//                    res.setText(Integer.toString(s1 / s2));
//                }else if (s2 == 0){
//                    res.setText("LÂM NGU VAI CA CUT !!!!!!!");
//                }
//                else{
//                    res.setText(Double.toString((double)s1 / s2));
//                }
//            }
//            
//        });
//        
//        
//    }
    
    // bai 2
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Name Converter");
//        frame.setLocationRelativeTo(null);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLayout(null);
//        frame.setVisible(true);
//        frame.setSize(400, 300);
//        
//        JLabel lblName = new JLabel("Full Name");
//        JLabel lblResult = new JLabel("Result");
//        lblName.setBounds(50, 50, 70, 30);
//        lblResult.setBounds(50, 100, 70, 30);
//        frame.add(lblName);
//        frame.add(lblResult);
//        
//        JTextField txtName = new JTextField ("");
//        JTextField txtRes = new JTextField ("");
//        txtName.setBounds(120, 50, 200, 30);
//        txtRes.setBounds(120, 100, 200, 30);
//        frame.add(txtName);
//        frame.add(txtRes);
//        
//        JButton btnConvert = new JButton("Convert");
//        btnConvert.setBounds(130, 160, 100, 30);
//        btnConvert.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String []s = txtName.getText().split(" ");
//                String res = "";
//                for (int i = 0; i < s.length; i++){
//                    res += Character.toUpperCase(s[i].charAt(0));
//                    res += s[i].substring(1);
//                    res += " ";
//                }
//                txtRes.setText(res.trim());
//            }
//            
//        });
//        frame.add(btnConvert);
//    }
    
    // bai 3
    public static void main(String[] args) {
        JFrame frame = new JFrame ("Word Count");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(400, 300);
        
        JLabel lblData = new JLabel("Data");
        lblData.setBounds(20, 50, 50, 30);
        frame.add(lblData);
        JLabel lblNo = new JLabel("Number of distinct word: ");
        lblNo.setBounds(20, 200, 150, 30);
        frame.add(lblNo);
        
        
        JTextArea txtData = new JTextArea("");
        txtData.setBounds(100, 50, 250, 100);
        txtData.setLineWrap(true);
        txtData.setWrapStyleWord(true);
        frame.add(txtData);
        
        JTextField txtNo = new JTextField("");
        txtNo.setBounds(180, 200, 170, 30);
        frame.add(txtNo);
        
        JButton btnCount = new JButton("Count");
        btnCount.setBounds(20, 170, 70, 30);
        btnCount.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = 0;
                HashSet<String> set = new HashSet<>();
                String []s = txtData.getText().split(" ");
                for (int i = 0; i < s.length; i++){
                    set.add(s[i]);
                }
                txtNo.setText(set.size() + "");
            }
            
        });
        frame.add(btnCount);
        

    }
 
}
