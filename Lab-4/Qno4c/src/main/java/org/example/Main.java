package org.example;

import java.util.Properties;
import javax.mail.*;
import javax.mail.search.FlagTerm;  // Import FlagTerm to search for flags
import javax.mail.Flags;

public class Main {
    public static void main(String[] args) {
        String host = "imap.gmail.com";  // IMAP host for Gmail
        String mailStoreType = "imap";
        String username = "reasonkc842@gmail.com";  // Replace with your email
        String password = "jwcs oers kgnq sqcd";  // Replace with your Gmail App Password

        try {
            // Setup properties for the mail session
            Properties properties = new Properties();
            properties.put("mail.imap.host", host);
            properties.put("mail.imap.port", "993");  // IMAP SSL port for Gmail
            properties.put("mail.imap.ssl.enable", "true");  // Enable SSL for secure connection

            // Get the mail session
            Session session = Session.getDefaultInstance(properties);

            // Connect to the mail store (IMAP server)
            Store store = session.getStore(mailStoreType);
            store.connect(host, username, password);  // Use your Gmail credentials here

            // Get the inbox folder
            Folder folder = store.getFolder("INBOX");
            folder.open(Folder.READ_WRITE);  // Open inbox folder in read-write mode

            // Search for unread messages
            Flags seenFlag = new Flags(Flags.Flag.SEEN);  // Flag to indicate the email is read
            FlagTerm searchCondition = new FlagTerm(seenFlag, false);  // Unread emails (false means not seen)

            // Search for unread messages
            Message[] messages = folder.search(searchCondition);

            if (messages.length > 0) {
                System.out.println("New email(s) received!");
                for (Message message : messages) {
                    // Process the new message
                    System.out.println("Subject: " + message.getSubject());
                    System.out.println("From: " + message.getFrom()[0]);
                    System.out.println("Text: " + message.getContent().toString());

                    // Mark the email as read after processing (optional)
                    message.setFlag(Flags.Flag.SEEN, true);
                }
            } else {
                System.out.println("No new emails.");
            }

            // Close the folder and store connections
            folder.close(false);
            store.close();
        } catch (Exception e) {
            e.printStackTrace();  // Handle exceptions
        }
    }
}
