import javax.swing.*;
import java.awt.event.*;

public class Form {
    JFrame frame;
    JLabel nameLabel, phoneLabel, genderLabel, dobLabel, addressLabel, title;
    JTextField nameField, phoneField;
    JRadioButton maleRadioButton, femaleRadioButton;
    ButtonGroup genderButtonGroup;
    JComboBox<String> dayComboBox, monthComboBox, yearComboBox;
    JTextArea addressTextArea, displayTextArea;
    JCheckBox agreementCheckBox;
    JButton submitButton, resetButton;

    Form() {
        frame = new JFrame("Form Pendaftaran");
        frame.setSize(750, 400);
        frame.setLayout(null);

        title = new JLabel("Form Pendaftaran");
        title.setBounds(20, 20, 150, 20);
        frame.add(title);

        nameLabel = new JLabel("Nama:");
        nameLabel.setBounds(20, 50, 100, 20);
        frame.add(nameLabel);
        nameField = new JTextField();
        nameField.setBounds(120, 50, 200, 20);
        frame.add(nameField);

        phoneLabel = new JLabel("No. HP:");
        phoneLabel.setBounds(20, 80, 100, 20);
        frame.add(phoneLabel);
        phoneField = new JTextField();
        phoneField.setBounds(120, 80, 200, 20);
        frame.add(phoneField);

        genderLabel = new JLabel("Jenis Kelamin:");
        genderLabel.setBounds(20, 110, 100, 20);
        frame.add(genderLabel);
        maleRadioButton = new JRadioButton("Laki-laki");
        maleRadioButton.setBounds(120, 110, 100, 20);
        frame.add(maleRadioButton);
        femaleRadioButton = new JRadioButton("Perempuan");
        femaleRadioButton.setBounds(220, 110, 100, 20);
        frame.add(femaleRadioButton);
        genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(maleRadioButton);
        genderButtonGroup.add(femaleRadioButton);

        dobLabel = new JLabel("Tanggal Lahir:");
        dobLabel.setBounds(20, 140, 100, 20);
        frame.add(dobLabel);
        String[] days = new String[31];
        for (int i = 1; i <= 31; i++) {
            days[i - 1] = String.valueOf(i);
        }
        dayComboBox = new JComboBox<>(days);
        dayComboBox.setBounds(120, 140, 50, 20);
        frame.add(dayComboBox);
        String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        monthComboBox = new JComboBox<>(months);
        monthComboBox.setBounds(180, 140, 60, 20);
        frame.add(monthComboBox);
        String[] years = new String[111]; // Ubah ukuran array menjadi 111
        for (int i = 1900; i <= 2010; i++) { // Ubah batas perulangan menjadi 2010
            years[i - 1900] = String.valueOf(i);
        }
        yearComboBox = new JComboBox<>(years);
        yearComboBox.setBounds(250, 140, 70, 20);
        frame.add(yearComboBox);

        addressLabel = new JLabel("Alamat:");
        addressLabel.setBounds(20, 170, 100, 20);
        frame.add(addressLabel);
        addressTextArea = new JTextArea();
        addressTextArea.setBounds(120, 170, 200, 60);
        frame.add(addressTextArea);

        agreementCheckBox = new JCheckBox("Telah menyetujui syarat dan ketentuan");
        agreementCheckBox.setBounds(20, 240, 300, 20);
        frame.add(agreementCheckBox);

        submitButton = new JButton("Submit");
        submitButton.setBounds(20, 270, 100, 30);
        frame.add(submitButton);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (agreementCheckBox.isSelected()) {
                    String name = nameField.getText();
                    String phone = phoneField.getText();
                    String gender = maleRadioButton.isSelected() ? "Laki-laki" : "Perempuan";
                    String dob = (String) dayComboBox.getSelectedItem() + " " + (String) monthComboBox.getSelectedItem()
                            + " " + (String) yearComboBox.getSelectedItem();
                    String address = addressTextArea.getText();
                    String message = "Nama: " + name + "\nNo. HP: " + phone + "\nJenis Kelamin: " + gender
                            + "\nTanggal Lahir: " + dob + "\nAlamat: " + address;
                    displayTextArea.setText(message);
                } else {
                    JOptionPane.showMessageDialog(frame, "Silakan ceklis syarat & ketentuan terlebih dahulu");
                }
            }
        });

        resetButton = new JButton("Reset");
        resetButton.setBounds(130, 270, 100, 30);
        frame.add(resetButton);
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                phoneField.setText("");
                maleRadioButton.setSelected(false);
                femaleRadioButton.setSelected(false);
                dayComboBox.setSelectedIndex(0);
                monthComboBox.setSelectedIndex(0);
                yearComboBox.setSelectedIndex(0);
                addressTextArea.setText("");
                agreementCheckBox.setSelected(false);
                displayTextArea.setText("");
            }
        });

        displayTextArea = new JTextArea();
        displayTextArea.setBounds(350, 50, 350, 250);
        frame.add(displayTextArea);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Form();
    }
}