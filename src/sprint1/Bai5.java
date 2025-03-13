package bai5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai5 {
    public static void main(String[] args) {
        // Tạo cửa sổ giao diện
        JFrame frame = new JFrame("Tính Thành Tiền");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2));

        // Tạo các thành phần giao diện
        JLabel labelA = new JLabel("Nhập A:");
        JTextField txtA = new JTextField();
        JLabel labelB = new JLabel("Nhập B:");
        JTextField txtB = new JTextField();
        JButton btnTinh = new JButton("Tính Thành Tiền");
        JLabel labelKQ = new JLabel("Kết quả:");
        JLabel result = new JLabel();

        // Xử lý sự kiện khi nhấn nút tính toán
        btnTinh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(txtA.getText());
                    double b = Double.parseDouble(txtB.getText());
                    double thanhTien = a * b;
                    result.setText(String.valueOf(thanhTien));
                } catch (NumberFormatException ex) {
                    result.setText("Lỗi nhập liệu");
                }
            }
        });

        // Thêm các thành phần vào frame
        frame.add(labelA);
        frame.add(txtA);
        frame.add(labelB);
        frame.add(txtB);
        frame.add(btnTinh);
        frame.add(labelKQ);
        frame.add(result);

        // Hiển thị giao diện
        frame.setVisible(true);
    }
}