//Qno14b) Write data to a file using FileOutputStream
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("output.txt");
            String s = "Hello World!";
            byte[] b = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Data written to file");
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
