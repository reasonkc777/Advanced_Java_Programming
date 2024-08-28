//Create a class named "Box" with methods to print variable values and calculate volume
class Box {
    int length, breadth, height;  // Attributes of the Box class

    // Constructor to initialize the attributes
    Box(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    // Method to calculate the volume of the box
    int calculateVolume() {
        return length * breadth * height;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the Box class
        Box myBox = new Box(10, 20, 30);

        // Calculating and displaying the volume of the box
        int volume = myBox.calculateVolume();
        System.out.println("Volume of the box: " + volume);
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}