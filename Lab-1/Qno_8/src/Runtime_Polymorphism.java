//Qno8b Runtime Polymorphism

class Figure {
    void area() {
        System.out.println("Area of Figure");
    }
}

class Rectangle extends Figure {
    @Override
    void area() {
        System.out.println("Area of Rectangle");
    }
}

class Triangle extends Figure {
    @Override
    void area() {
        System.out.println("Area of Triangle");
    }

    public static void main(String[] args) {
        Figure f;
        f = new Rectangle();
        f.area();  // Calls Rectangle's area()

        f = new Triangle();
        f.area();  // Calls Triangle's area()
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
