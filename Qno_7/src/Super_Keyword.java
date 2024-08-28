//Qno7a Super Keyword
class Parent {
    int x = 10;

    Parent() {
        System.out.println("Parent Constructor");
    }

    void display() {
        System.out.println("Parent Display");
    }
}

class Child extends Parent {
    int x = 20;

    Child() {
        super();  // Calling parent class constructor
        System.out.println("Child Constructor");
    }

    void display() {
        super.display();  // Calling parent class method
        System.out.println("Child Display");
        System.out.println("x in Child: " + x);
        System.out.println("x in Parent: " + super.x);  // Accessing parent class variable
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.display();
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
