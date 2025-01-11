import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class GUIComponents {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400); // Set a smaller window size

        // Use BoxLayout to arrange components vertically with a little gap
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        frame.setIconImage(new ImageIcon("icon.png").getImage());

        // Creating components
        JLabel labelWithIcon = new JLabel("Label with Icon", new ImageIcon("icon.png"), JLabel.CENTER);
        JLabel nameLabel = new JLabel("Your Name Here");

        JTextField textField = new JTextField(15);
        textField.setBorder(new LineBorder(Color.BLUE, 2));
        textField.setToolTipText("Enter text here");

        JTextArea textArea = new JTextArea(5, 20);
        JScrollPane textAreaScroll = new JScrollPane(textArea);
        textAreaScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        textAreaScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        JCheckBox checkBox = new JCheckBox("Check me!");
        JPasswordField passwordField = new JPasswordField(15);

        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(radioButton1);
        radioGroup.add(radioButton2);

        JButton pushButton = new JButton("Click Me!");
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"Option 1", "Option 2", "Option 3"});

        // Panel for components with some padding
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // BoxLayout for vertical arrangement
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Add padding to the panel

        // Adding components to the panel
        panel.add(labelWithIcon);
        panel.add(Box.createVerticalStrut(10)); // Adding space between components
        panel.add(nameLabel);
        panel.add(Box.createVerticalStrut(10));
        panel.add(textField);
        panel.add(Box.createVerticalStrut(10));
        panel.add(textAreaScroll);
        panel.add(Box.createVerticalStrut(10));
        panel.add(checkBox);
        panel.add(Box.createVerticalStrut(10));
        panel.add(passwordField);
        panel.add(Box.createVerticalStrut(10));
        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(Box.createVerticalStrut(10));
        panel.add(pushButton);
        panel.add(Box.createVerticalStrut(10));
        panel.add(comboBox);

        // Add the panel to the frame
        frame.add(panel);

        frame.setVisible(true);
    }
}
