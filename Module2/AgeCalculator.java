
package Module2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.*;

public class AgeCalculator extends JFrame implements ActionListener {
    private JTextField yearField, monthField, dayField;
    private JButton calculateButton;
    private JLabel resultLabel;
    private JPanel panel;

    public AgeCalculator() {
        setTitle("Age Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        // Input fields
        panel.add(new JLabel("Year of Birth:"));
        yearField = new JTextField(4);
        panel.add(yearField);

        panel.add(new JLabel("Month of Birth:"));
        monthField = new JTextField(2);
        panel.add(monthField);

        panel.add(new JLabel("Day of Birth:"));
        dayField = new JTextField(2);
        panel.add(dayField);

        // Button
        calculateButton = new JButton("Calculate Age");
        calculateButton.addActionListener(this);
        panel.add(calculateButton);

        // Result label
        resultLabel = new JLabel("Your age will appear here.");
        panel.add(resultLabel);

        // Add panel to frame
        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int year = Integer.parseInt(yearField.getText());
            int month = Integer.parseInt(monthField.getText());
            int day = Integer.parseInt(dayField.getText());

            LocalDate birthDate = LocalDate.of(year, month, day);
            LocalDate today = LocalDate.now();
            Period age = Period.between(birthDate, today);

            resultLabel.setText("You are " + age.getYears() + " years old.");
        } catch (Exception ex) {
            resultLabel.setText("Invalid date input.");
        }
    }

    public static void main(String[] args) {
        new AgeCalculator();
    }
}