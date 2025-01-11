import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class CRUDApplication {
    private final JTextField idField;
    private final JTextField nameField;
    private final JRadioButton maleButton;
    private final JRadioButton femaleButton;
    private final JComboBox<String> roleComboBox;
    private final JTextArea outputArea;

    public CRUDApplication() {
        JFrame frame = new JFrame("CRUD Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // ID
        JLabel idLabel = new JLabel("ID:");
        idField = new JTextField();
        panel.add(idLabel);
        panel.add(idField);

        // Name
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        panel.add(nameLabel);
        panel.add(nameField);

        // Gender
        JLabel genderLabel = new JLabel("Gender:");
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        panel.add(genderLabel);
        panel.add(genderPanel);

        // Role
        JLabel roleLabel = new JLabel("Role:");
        roleComboBox = new JComboBox<>(new String[]{"Admin", "User", "Guest"});
        panel.add(roleLabel);
        panel.add(roleComboBox);

        // Buttons
        JButton createButton = new JButton("Create");
        JButton readButton = new JButton("Read");
        JButton updateButton = new JButton("Update");
        JButton deleteButton = new JButton("Delete");
        panel.add(createButton);
        panel.add(readButton);
        panel.add(updateButton);
        panel.add(deleteButton);

        frame.add(panel, BorderLayout.NORTH);

        // Output Area
        outputArea = new JTextArea(10, 40);
        outputArea.setEditable(false);
        frame.add(new JScrollPane(outputArea), BorderLayout.CENTER);

        // Button Actions
        createButton.addActionListener(e -> createRecord());
        readButton.addActionListener(e -> readRecords());
        updateButton.addActionListener(e -> updateRecord());
        deleteButton.addActionListener(e -> deleteRecord());

        frame.setVisible(true);
    }

    private Connection connectDatabase() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "1234567890");
    }

    private void createRecord() {
        if (nameField.getText().isEmpty() || (!maleButton.isSelected() && !femaleButton.isSelected())) {
            outputArea.setText("Error: Name and Gender fields must be filled!");
            return;
        }

        try (Connection conn = connectDatabase()) {
            String query = "INSERT INTO users (name, gender, role) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, nameField.getText());
            pstmt.setString(2, maleButton.isSelected() ? "Male" : "Female");
            pstmt.setString(3, roleComboBox.getSelectedItem().toString());
            pstmt.executeUpdate();
            outputArea.setText("Record Created Successfully!");
        } catch (SQLException e) {
            outputArea.setText("Database Error: " + e.getMessage());
        }
    }

    private void readRecords() {
        try (Connection conn = connectDatabase()) {
            String query = "SELECT * FROM users";
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();

            StringBuilder output = new StringBuilder("ID\tName\tGender\tRole\n");
            while (rs.next()) {
                output.append(rs.getInt("id")).append("\t")
                        .append(rs.getString("name")).append("\t")
                        .append(rs.getString("gender")).append("\t")
                        .append(rs.getString("role")).append("\n");
            }
            outputArea.setText(output.toString());
        } catch (SQLException e) {
            outputArea.setText("Database Error: " + e.getMessage());
        }
    }

    private void updateRecord() {
        if (idField.getText().isEmpty() || nameField.getText().isEmpty() || (!maleButton.isSelected() && !femaleButton.isSelected())) {
            outputArea.setText("Error: All fields must be filled!");
            return;
        }

        try (Connection conn = connectDatabase()) {
            String query = "UPDATE users SET name = ?, gender = ?, role = ? WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, nameField.getText());
            pstmt.setString(2, maleButton.isSelected() ? "Male" : "Female");
            pstmt.setString(3, roleComboBox.getSelectedItem().toString());
            pstmt.setInt(4, Integer.parseInt(idField.getText()));
            int rowsUpdated = pstmt.executeUpdate();
            outputArea.setText(rowsUpdated > 0 ? "Record Updated Successfully!" : "Record Not Found!");
        } catch (NumberFormatException e) {
            outputArea.setText("Error: ID must be a valid number.");
        } catch (SQLException e) {
            outputArea.setText("Database Error: " + e.getMessage());
        }
    }

    private void deleteRecord() {
        if (idField.getText().isEmpty()) {
            outputArea.setText("Error: ID field must be filled!");
            return;
        }

        try (Connection conn = connectDatabase()) {
            String query = "DELETE FROM users WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, Integer.parseInt(idField.getText()));
            int rowsDeleted = pstmt.executeUpdate();
            outputArea.setText(rowsDeleted > 0 ? "Record Deleted Successfully!" : "Record Not Found!");
        } catch (NumberFormatException e) {
            outputArea.setText("Error: ID must be a valid number.");
        } catch (SQLException e) {
            outputArea.setText("Database Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CRUDApplication::new);
    }
}
