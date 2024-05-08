import javax.swing.*;
public class Swing {
    public static void main(String[] args) {
        JFrame f = new JFrame(); //create instance Jframe

        JButton tombol = new JButton("Tombol"); //create instance JButton
        tombol.setBounds(130,100,100,40); //x axis, y axix, widht, height

        f.add(tombol); //tambahkan button b di JFrame

        f.setSize(400,500); //400 width, 500 height
        f.setLayout(null); //no layout managers
        f.setVisible(true); //frame visible
    }
}