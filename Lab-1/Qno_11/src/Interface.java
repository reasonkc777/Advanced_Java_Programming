//Qno11 Interface in Java
interface Shape {
    void area(double x, double y);
    void perimeter(double x, double y);
}

class Rectangle implements Shape {
    @Override
    public void area(double x, double y) {
        System.out.println("Area: " + (x * y));
    }

    @Override
    public void perimeter(double x, double y) {
        System.out.println("Perimeter: " + 2 * (x + y));
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.area(10, 5);
        r.perimeter(10, 5);
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
