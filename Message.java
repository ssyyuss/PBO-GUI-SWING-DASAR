import javax.swing.*;

public class Message {
    JFrame f;
    Message() {
        f = new JFrame();
        JOptionPane.showMessageDialog(f, "Selamat datang di Java GUI");
    }
    public static void main(String[] args) {
        new Message();
    }   
}