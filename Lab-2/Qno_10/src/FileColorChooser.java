import javax.swing.*;
import java.awt.*;

public class FileColorChooser {
    public static void main(String[] args) {
        JFrame frame = new JFrame("File and Color Choosers");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton fileChooserButton = new JButton("Open File Chooser");
        fileChooserButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                JOptionPane.showMessageDialog(frame, "Selected File: " + fileChooser.getSelectedFile().getPath());
            }
        });

        JButton colorChooserButton = new JButton("Open Color Chooser");
        colorChooserButton.addActionListener(e -> {
            Color selectedColor = JColorChooser.showDialog(frame, "Choose a Color", Color.BLACK);
            if (selectedColor != null) {
                frame.getContentPane().setBackground(selectedColor);
            }
        });

        JPanel panel = new JPanel();
        panel.add(fileChooserButton);
        panel.add(colorChooserButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
