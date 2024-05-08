import java.awt.event.*;
import javax.swing.*;
public class Button {
    public static void main(String[] args) {
        JFrame f = new JFrame("Button Example");
        JButton b = new JButton("Click Here");
        final JTextField tf = new JTextField();
        b.setBounds(50,100,95,30);
        tf.setBounds(50,150,150,20);
        b.addActionListener(new ActionListener() { //menambahkan action listener pada tombol
            public void actionPerformed(ActionEvent e){ //saat ditekan, actionPerfomed() akan dipanggil
                tf.setText("ini adalah action dari klik tombol");
            }
        });
        f.add(b);
        f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
