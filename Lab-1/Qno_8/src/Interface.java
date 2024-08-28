//Qno8d Interface
interface Shape_ {
    void area(double x, double y);
    void perimeter(double x, double y);
}

class Rectangle_ implements Shape_ {
    @Override
    public void area(double x, double y) {
        System.out.println("Area: " + (x * y));
    }

    @Override
    public void perimeter(double x, double y) {
        System.out.println("Perimeter: " + 2 * (x + y));
    }

    public static void main(String[] args) {
        Rectangle_ r = new Rectangle_();
        r.area(5, 3);
        r.perimeter(5, 3);
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
