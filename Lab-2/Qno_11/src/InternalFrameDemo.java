import javax.swing.*;

public class InternalFrameDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Internal Frames");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JDesktopPane desktopPane = new JDesktopPane();

        JInternalFrame internalFrame1 = new JInternalFrame("Frame 1", true, true, true, true);
        internalFrame1.setSize(200, 150);
        internalFrame1.setVisible(true);

        JInternalFrame internalFrame2 = new JInternalFrame("Frame 2", true, true, true, true);
        internalFrame2.setSize(200, 150);
        internalFrame2.setLocation(220, 0);
        internalFrame2.setVisible(true);

        desktopPane.add(internalFrame1);
        desktopPane.add(internalFrame2);

        frame.add(desktopPane);
        frame.setVisible(true);
    }
}
