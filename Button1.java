import java.awt.event.*;
import javax.swing.*;

public class Button1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Button Example");
        JButton b = new JButton("Click Here!");
        final JLabel label = new JLabel();
        b.setBounds(50,100,95,30);
        label.setBounds(50,150,200,20);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                label.setText("Halo, selamat datang");
            }
        });
        f.add(b);
        f.add(label);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}