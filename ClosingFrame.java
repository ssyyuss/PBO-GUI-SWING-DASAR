import javax.swing.*;
import java.awt.event.*;

public class ClosingFrame extends JFrame {
    public ClosingFrame() {
        setTitle("Frame Kosong");
        setSize(300, 200);
        
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin keluar?", "Konfirmasi", JOptionPane.YES_NO_CANCEL_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    dispose();
                } else if (confirm == JOptionPane.NO_OPTION) {
                    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ClosingFrame().setVisible(true);
            }
        });
    }
}