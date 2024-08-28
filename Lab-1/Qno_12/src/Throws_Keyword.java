//Qno12e Throws Keyword
import java.io.*;

public class Throws_Keyword {
    void method() throws IOException {
        throw new IOException("Device error");
    }

    public static void main(String[] args) {
        try {
            Throws_Keyword obj = new Throws_Keyword();
            obj.method();
        } catch (IOException e) {
            System.out.println("Exception caught: " + e);
        }
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
