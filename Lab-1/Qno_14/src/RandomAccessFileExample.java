//Qno14e) Use of RandomAccessFile for random access of file
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("datafile.txt", "rw");
            raf.writeUTF("Hello World");
            raf.seek(0);
            System.out.println(raf.readUTF());
            raf.seek(6);
            raf.writeUTF("Java");
            raf.seek(0);
            System.out.println(raf.readUTF());
            raf.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
