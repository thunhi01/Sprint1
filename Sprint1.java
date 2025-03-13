/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sprint1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sprint1 {
    public static void main(String[] args) {
        // Tạo frame
        JFrame frame = new JFrame("Tính Tiền Nước");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2, 10, 10));
        
        // Tạo các thành phần giao diện
        JLabel labelA = new JLabel("Chỉ số A:");
        JTextField textA = new JTextField();
        JLabel labelB = new JLabel("Chỉ số B:");
        JTextField textB = new JTextField();
        JLabel resultLabel = new JLabel("Thành tiền:");
        JTextField resultField = new JTextField();
        resultField.setEditable(false);
        JButton btnCalculate = new JButton("Tính tiền");
        
        // Bai6 Pham Hoang Long
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double A = Double.parseDouble(textA.getText());
                    double B = Double.parseDouble(textB.getText());
                    
                    if (A < B) {
                        resultField.setText("A phải lớn hơn B");
                    } else {
                        double total = (A - B) * 10000;
                        resultField.setText(String.format("%.0f VND", total));
                    }
                } catch (NumberFormatException ex) {
                    resultField.setText("Vui lòng nhập số hợp lệ");
                }
            }
        });
        
        // Thêm các thành phần vào frame
        frame.add(labelA);
        frame.add(textA);
        frame.add(labelB);
        frame.add(textB);
        frame.add(resultLabel);
        frame.add(resultField);
        frame.add(btnCalculate);
        
        // Hiển thị giao diện
        frame.setVisible(true);
    }
}

