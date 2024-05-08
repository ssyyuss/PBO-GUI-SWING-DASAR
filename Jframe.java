import javax.swing.*;
class Swing extends JFrame { //Swing inherintance pada JFrame
    JFrame f;
    Swing() {
        JButton tombol = new JButton("Tombol"); //buat button
        tombol.setBounds(130,100,100,40);

        add(tombol); //menambahkan button pada frame
        setSize(400,500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Swing();
    }

}
