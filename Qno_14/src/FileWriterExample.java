//Qno14g) Use of FileWriter class
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("output.txt")) {
            fw.write("Hello World!");
            System.out.println("Data written to file");
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
