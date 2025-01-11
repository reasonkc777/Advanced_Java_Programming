import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;  // Add this import
import java.awt.*;

public class AdvancedComponents {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Advanced Components");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new FlowLayout());

        // Slider
        JSlider slider = new JSlider(0, 100, 50);
        slider.addChangeListener(e -> System.out.println("Slider Value: " + slider.getValue()));

        // List
        JList<String> list = new JList<>(new String[]{"Option 1", "Option 2", "Option 3"});
        list.addListSelectionListener(e -> System.out.println("Selected: " + list.getSelectedValue()));

        // Table
        String[] columns = {"Name", "Age"};
        Object[][] data = {{"Alice", 25}, {"Bob", 30}};
        JTable table = new JTable(new DefaultTableModel(data, columns));

        // Progress Bar
        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setValue(75);
        progressBar.setStringPainted(true);

        // Tree
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        root.add(child1);
        root.add(child2);
        JTree tree = new JTree(root);

        // Adding components to the frame
        frame.add(slider);
        frame.add(new JScrollPane(list));
        frame.add(new JScrollPane(table));
        frame.add(progressBar);
        frame.add(new JScrollPane(tree));

        frame.setVisible(true);
    }
}
