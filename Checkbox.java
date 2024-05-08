import javax.swing.*;
import java.awt.event.*;
public class Checkbox extends JFrame implements ActionListener {
    JLabel l;
    JCheckBox cb1, cb2,cb3;
    JButton b;
    Checkbox() {
        l = new JLabel("Form Pemesanan Makanan");
        l.setBounds (50,50,300,20);
        cb1= new JCheckBox("Rawon (Rp. 15.000)");
        cb1.setBounds (100, 100, 300,20);
        cb2 = new JCheckBox("Soto Ayam (Rp. 10.000)");
        cb2.setBounds (100, 150, 300,20);
        cb3= new JCheckBox("Es Teh (Rp. 3.000)");
        cb3.setBounds (100, 200, 300,20);
        b= new JButton("Pesan");
        b.setBounds (100, 250,80,30);
        b.addActionListener(this);
        add(l); add(cb1); add(cb2); add(cb3); add(b);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation (EXIT_ON_CLOSE);
    }
    public void actionPerformed (ActionEvent e) {
        float amount = 0;
        String msg = "";
        if(cb1.isSelected()) {
            amount += 15000;
            msg = "Rawon: 15.000\n";
        }
            if(cb2.isSelected()) {
            amount += 10000;
            msg += "Soto Ayam: 10.000\n";
        }
            if(cb3.isSelected()){
            amount += 3000;
            msg += "Es Teh: 3.000\n";
        }
            msg += "--------------------------\n";
            JOptionPane.showMessageDialog(this, msg + "Total: " + amount);
    }
    public static void main(String[] args) {
        new Checkbox();
    }
}