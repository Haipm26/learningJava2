/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Pham Minh Hai
 */
public class JFrameExp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Example");
        
//        JButton btn1 = new JButton("Username");
//        btn1.setBounds(50, 20, 100, 30);
//        frame.add(btn1);
//        
//        JButton btn2 = new JButton("Password");
//        btn2.setBounds(50, 100, 100, 30);
//        frame.add(btn2);
//        
//        //them su kien
//        btn1.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("CC");
//                btn1.setText("HEHE");
//            }
//            
//        });
        
//        JLabel lbl1 = new JLabel("USERNAME : ");
//        lbl1.setBounds(50, 50, 100, 30);
//        frame.add(lbl1);
//        
//        JLabel lbl2 = new JLabel("PASSWORD : ");
//        lbl2.setBounds(50, 100, 100, 30);
//        frame.add(lbl2);
//        
//        JTextField username = new JTextField("");
//        JTextField password = new JTextField("");
//        
//        username.setBounds(170, 50, 100, 30);
//        password.setBounds(170, 100, 100, 30);
//        frame.add(username);
//        frame.add(password);
//        
//        JButton login = new JButton("LOGIN");
//        login.setBounds(150, 150, 100, 30);
//        frame.add(login);
//        
//        login.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println(username.getText());
//                System.out.println(password.getText());
////                username.setText("HEHEHEH");
//            }
//            
//        });
//        
//
//        JTextArea jta = new JTextArea();
//        jta.setBounds(50, 50, 200, 100);
//        jta.setLineWrap(true);
//        jta.setWrapStyleWord(true);
//        frame.add(jta);
//        
//        JButton bt = new JButton("CLICK");
//        bt.setBounds(100, 170, 100, 30);
//        frame.add(bt);
//        bt.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println(jta.getText());
//            }
//            
//        });
//        

//        JPasswordField password = new JPasswordField();
//        password.setBounds(50, 50, 80, 30);
//        frame.add(password);
//        
//        JButton btn = new JButton("CLICK");
//        btn.setBounds(50, 100, 100, 30);
//        frame.add(btn);
//        
//        btn.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println(password.getPassword());
//                String s = String.valueOf(password.getPassword());
//            }
//            
//        });
//        

        
            JLabel lbl1 = new JLabel("Username : ");
            JLabel lbl2 = new JLabel("Password : ");

            lbl1.setBounds(50, 50, 100, 30);
            lbl2.setBounds(50, 100, 100, 30);
        JTextField username = new JTextField();
        JPasswordField password = new JPasswordField();
        username.setBounds(150, 50, 150, 30);
        password.setBounds(150, 100, 150, 30);
        JButton login = new JButton("Login");
        login.setBounds(100, 150, 80, 30);
        frame.add(lbl1);
        frame.add(lbl2);
        frame.add(username);
        frame.add(password);
        frame.add(login);
        
        login.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (username.getText().equals("28tech") && String.valueOf(password.getPassword()).equals("28tech")){
                    JOptionPane.showMessageDialog(frame, "SUCCESSFUL");
                }else{
                    JOptionPane.showMessageDialog(frame, "FAILED");
                }
            }
            
        });
        
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        
        
    }
}
