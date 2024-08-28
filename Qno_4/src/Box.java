//Qno 4b Constructor Overloading
class Box {
    double length, breadth, height;

    // Constructor with no parameters
    Box() {
        length = breadth = height = 0;
    }

    // Constructor with one parameter
    Box(double side) {
        length = breadth = height = side;
    }

    // Constructor with three parameters
    Box(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    double volume() {
        return length * breadth * height;
    }

    public static void main(String[] args) {
        Box box1 = new Box();  // Default constructor
        Box box2 = new Box(5);  // Constructor with one parameter
        Box box3 = new Box(5, 3, 2);  // Constructor with three parameters

        System.out.println("Volume of box1: " + box1.volume());
        System.out.println("Volume of box2: " + box2.volume());
        System.out.println("Volume of box3: " + box3.volume());
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
