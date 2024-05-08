import javax.swing.*;
import java.awt.event.*;

public class Textarea implements ActionListener {
    JLabel l1,l2;
    JTextArea area;
    JButton b;

        Textarea() {
            JFrame f = new JFrame("Hitung Karakter");
            l1 = new JLabel("Program Penghitung Karakter");
            l1.setBounds(50, 25, 300, 30);
            l2 = new JLabel();
            l2.setBounds(160, 25, 300, 30);
            area = new JTextArea();
            area.setBounds(20, 75, 250, 200);
            b = new JButton("Hitung");
            b.setBounds(100,300,120,30);
            b.addActionListener(this);
            f.add(l1); f.add(l2); f.add(area); f.add(b);
            f.setSize(450, 450);
            f.setLayout(null);
            f.setVisible(true);
        }
        public void actionPerformed(ActionEvent e) {
            String text = area.getText();
            String words[] = text.split("\\s");
            l1.setText("Jumlah Kata : " + words.length);
            l2.setText("Jumlah Karakter : " + text.length());
        }
        public static void main(String[] args) {
            new Textarea();
        }

}
