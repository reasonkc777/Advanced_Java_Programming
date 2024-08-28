//Qno8c Abstract Class

abstract class Shape {
    abstract void draw();  // Abstract method

    void color() {
        System.out.println("Coloring the shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
        s.color();
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
