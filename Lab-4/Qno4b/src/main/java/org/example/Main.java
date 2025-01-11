package org.example;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class Main {
    public static void main(String[] args) {
        String to = "iowadakota777@gmail.com";
        String from = "iowadakota777@gmail.com";
        String host = "smtp.gmail.com";

        // Email properties configuration
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        // Create a session with authentication
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("reasonkc842@gmail.com", "jwcs oers kgnq sqcd"); // Replace with your Gmail password or App Password
            }
        });

        try {
            // Create a new email message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject("Test Email with Attachment");

            // Create the body part for the text message
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("Hello, this is a test email sent from Java with an attachment!");

            // Create a part for the attachment
            MimeBodyPart attachmentPart = new MimeBodyPart();
            // Use the correct file path with escaped backslashes or forward slashes
            attachmentPart.attachFile("C:/Users/reaso/Downloads/7th Semester/Lab Files/Java/Lab-4/LabWorks Part4.pdf");  // Replace with your actual file path

            // Combine the body and the attachment into a Multipart object
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            multipart.addBodyPart(attachmentPart);

            // Set the content of the message to the Multipart object
            message.setContent(multipart);

            // Send the email
            Transport.send(message);
            System.out.println("Email sent successfully with attachment.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
