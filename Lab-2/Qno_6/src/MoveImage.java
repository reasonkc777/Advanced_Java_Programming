import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MoveImage {
    static int x = 100, y = 100;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Move Image with Arrow Keys");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.RED);
                g.fillOval(x, y, 50, 50);  // Draw an oval as an image substitute
            }
        };

        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT -> x -= 10;
                    case KeyEvent.VK_RIGHT -> x += 10;
                    case KeyEvent.VK_UP -> y -= 10;
                    case KeyEvent.VK_DOWN -> y += 10;
                }
                panel.repaint();
            }
        });

        panel.setFocusable(true);
        frame.add(panel);
        frame.setVisible(true);
    }
}
