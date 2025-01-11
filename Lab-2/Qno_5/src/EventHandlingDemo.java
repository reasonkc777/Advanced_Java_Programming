import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventHandlingDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Event Handling");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());

        // Window Event
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window Closing");
            }
        });

        // Item Event
        JCheckBox checkBox = new JCheckBox("Check me!");
        checkBox.addItemListener(e -> {
            System.out.println(e.getStateChange() == ItemEvent.SELECTED ? "Checked!" : "Unchecked!");
        });

        // Mouse Event
        JButton button = new JButton("Mouse Over Me!");
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse Entered");
            }
        });

        // Key Event
        JTextField textField = new JTextField(20);
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Key Typed: " + e.getKeyChar());
            }
        });

        frame.add(checkBox);
        frame.add(button);
        frame.add(textField);

        frame.setVisible(true);
    }
}
