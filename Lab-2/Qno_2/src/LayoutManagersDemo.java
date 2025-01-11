import javax.swing.*;
import java.awt.*;

public class LayoutManagersDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Layout Managers");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // FlowLayout
        frame.setLayout(new FlowLayout());
        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));

        // Uncomment to try BorderLayout
        // frame.setLayout(new BorderLayout());
        // frame.add(new JButton("NORTH"), BorderLayout.NORTH);
        // frame.add(new JButton("SOUTH"), BorderLayout.SOUTH);

        // Uncomment to try GridLayout
        // frame.setLayout(new GridLayout(2, 2));
        // frame.add(new JButton("1"));
        // frame.add(new JButton("2"));

        frame.setVisible(true);
    }
}
