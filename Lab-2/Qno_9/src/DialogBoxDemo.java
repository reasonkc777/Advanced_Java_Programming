import javax.swing.*;

public class DialogBoxDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dialog Boxes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton modalButton = new JButton("Open Modal Dialog");
        modalButton.addActionListener(e -> {
            JDialog modalDialog = new JDialog(frame, "Modal Dialog", true);
            modalDialog.setSize(200, 100);
            modalDialog.setLocationRelativeTo(frame);
            modalDialog.add(new JLabel("This is a modal dialog!"));
            modalDialog.setVisible(true);
        });

        JButton modelessButton = new JButton("Open Modeless Dialog");
        modelessButton.addActionListener(e -> {
            JDialog modelessDialog = new JDialog(frame, "Modeless Dialog", false);
            modelessDialog.setSize(200, 100);
            modelessDialog.setLocationRelativeTo(frame);
            modelessDialog.add(new JLabel("This is a modeless dialog!"));
            modelessDialog.setVisible(true);
        });

        JPanel panel = new JPanel();
        panel.add(modalButton);
        panel.add(modelessButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
