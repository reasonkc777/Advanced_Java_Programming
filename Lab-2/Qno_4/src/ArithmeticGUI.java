import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArithmeticGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Arithmetic Operations");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        JTextField num1 = new JTextField(10);
        JTextField num2 = new JTextField(10);

        JButton addButton = new JButton("Add");
        JButton subtractButton = new JButton("Subtract");
        JButton multiplyButton = new JButton("Multiply");

        JLabel result = new JLabel("Result: ");

        addButton.addActionListener(e -> {
            int sum = Integer.parseInt(num1.getText()) + Integer.parseInt(num2.getText());
            result.setText("Result: " + sum);
        });

        subtractButton.addActionListener(e -> {
            int diff = Integer.parseInt(num1.getText()) - Integer.parseInt(num2.getText());
            result.setText("Result: " + diff);
        });

        multiplyButton.addActionListener(e -> {
            int product = Integer.parseInt(num1.getText()) * Integer.parseInt(num2.getText());
            result.setText("Result: " + product);
        });

        frame.add(new JLabel("Number 1:"));
        frame.add(num1);
        frame.add(new JLabel("Number 2:"));
        frame.add(num2);
        frame.add(addButton);
        frame.add(subtractButton);
        frame.add(multiplyButton);
        frame.add(result);

        frame.setVisible(true);
    }
}
