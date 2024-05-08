import javax.swing.*;

public class Welcome {
    JFrame f;

    Welcome() {
        f = new JFrame();
        String name = JOptionPane.showInputDialog(f, "Masukkan nama:");
        if (name != null) {
            int option = JOptionPane.showConfirmDialog(f, "Selamat datang di Java GUI, " + name + "!", 
            "Selamat Datang",
                    JOptionPane.OK_CANCEL_OPTION);
            if (option == JOptionPane.OK_OPTION) {
                JOptionPane.showMessageDialog(f, "Selamat datang di Java GUI, " + name + "!", "Pesan",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new Welcome();
    }
}