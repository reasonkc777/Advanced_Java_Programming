//Qno14h) Read text from keyboard and write to a file
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFileFromKeyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to write to file:");
        String input = scanner.nextLine();

        try (FileWriter fw = new FileWriter("output.txt")) {
            fw.write(input);
            System.out.println("Data written to file");
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
