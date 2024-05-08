import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

public class Combobox {
    JFrame f;
    JComboBox<String> cb; // Mengubah variabel cb menjadi variabel kelas

    Combobox() {
        f = new JFrame("Frame ComboBox");
        f.setLayout(new FlowLayout()); // Menggunakan FlowLayout
        
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400, 100);

        String languages[] = {"Java", "Python", "C++", "JavaScript", "Swift"};
        cb = new JComboBox<>(languages); // Menginisialisasi cb sebagai variabel kelas
        cb.setBounds(50, 50, 150, 30);

        JButton b = new JButton("Show");
        b.setBounds(200, 50, 80, 30);

        f.add(cb);
        f.add(label);
        f.add(b);

        f.setSize(350, 350);
        f.setVisible(true);
        
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Programming language: " + cb.getItemAt(cb.getSelectedIndex());
                label.setText(data);
            }
        });
    }

    public static void main(String[] args) {
        new Combobox();
    }
}