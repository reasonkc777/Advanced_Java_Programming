import javax.swing.*;

public class JOptionPaneDemo {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "This is an information dialog.", "Info", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is a warning dialog.", "Warning", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is an error dialog.", "Error", JOptionPane.ERROR_MESSAGE);

        int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm", JOptionPane.YES_NO_OPTION);
        System.out.println("User Response: " + response);

        String input = JOptionPane.showInputDialog(null, "Enter your name:", "Input", JOptionPane.QUESTION_MESSAGE);
        System.out.println("User Input: " + input);

        Object[] options = {"Option 1", "Option 2", "Option 3"};
        int optionSelected = JOptionPane.showOptionDialog(null, "Choose an option:", "Options", JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        System.out.println("Option Selected: " + optionSelected);
    }
}
