package sprint1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sprint1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Máy tính nhân hai số");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(4, 1));
        
        JTextField txtA = new JTextField();
        JTextField txtB = new JTextField();
        JButton btnMultiply = new JButton("Nhân");
        JLabel lblResult = new JLabel("Kết quả: ", SwingConstants.CENTER);
        
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(txtA.getText());
                    double b = Double.parseDouble(txtB.getText());
                    double result = a * b;
                    lblResult.setText("Kết quả: " + result);
                } catch (NumberFormatException ex) {
                    lblResult.setText("Vui lòng nhập số hợp lệ!");
                }
            }
        });
        
        frame.add(txtA);
        frame.add(txtB);
        frame.add(btnMultiply);
        frame.add(lblResult);
        
        frame.setVisible(true);
    }
}
