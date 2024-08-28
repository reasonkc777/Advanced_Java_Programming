//Qno14c) Read from an image file and write to another image file
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImageFile {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("source.jpg");
             FileOutputStream fout = new FileOutputStream("destination.jpg")) {
            int i;
            while ((i = fin.read()) != -1) {
                fout.write(i);
            }
            System.out.println("Image copied successfully");
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
