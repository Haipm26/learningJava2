/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.pkg21;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Pham Minh Hai
 */
public class Calculator2 implements ActionListener{
    private JButton btn1, btn2;
    private JTextField link;
    private JFrame frame;
    Calculator2(){
        btn1 = new JButton("Website");
        btn2 = new JButton("Youtube");
        link = new JTextField("");
        frame = new JFrame("JTextField Example");
        btn1.setBounds(50, 50, 100, 30);
        btn2.setBounds(150, 50, 100, 30);
        link.setBounds(50, 100, 180, 30);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(link);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn1){
            link.setText("28tech.com.vn");
        }
        else{
            link.setText("youtube.com/28tech_");
        }
    }
    
}
