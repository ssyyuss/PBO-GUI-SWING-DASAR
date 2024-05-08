import javax.swing.*;
import java.awt.event.*;

public class RadioButton extends JFrame implements ActionListener {
    JRadioButton rb1, rb2;
    JButton button;

    RadioButton() {
        rb1 = new JRadioButton("Laki - Laki");
        rb1.setBounds(100, 100, 300, 20);
        rb2 = new JRadioButton("Perempuan");
        rb2.setBounds(100, 150, 300, 20);
        button = new JButton("Klik");
        button.setBounds(100, 250, 80, 30);
        button.addActionListener(this);
;
        add(rb1);
        add(rb2);
        add(button);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String msg = "\n";

        if (rb1.isSelected()) {
            msg += "laki - Laki\n";
        }
        if (rb2.isSelected()) { 
            msg += "Perempuan\n";
        
        }
        JOptionPane.showMessageDialog(this, msg);
    }

    public static void main(String[] args) {
        new RadioButton();
    }
}