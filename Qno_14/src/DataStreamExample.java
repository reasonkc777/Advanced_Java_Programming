//Qno14d) Demonstrate DataInputStream and DataOutputStream
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("datafile.txt");
            DataOutputStream dout = new DataOutputStream(fout);
            dout.writeInt(65);
            dout.writeUTF("Hello World");
            dout.close();

            FileInputStream fin = new FileInputStream("datafile.txt");
            DataInputStream din = new DataInputStream(fin);
            int num = din.readInt();
            String str = din.readUTF();
            System.out.println("Number: " + num);
            System.out.println("String: " + str);
            din.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
