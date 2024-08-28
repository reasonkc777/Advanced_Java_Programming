//Qno8a Method Overriding
class Parent {
    void show() {
        System.out.println("Parent's show()");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child's show()");
    }

    public static void main(String[] args) {
        Parent obj = new Child();  // Polymorphism
        obj.show();  // Calls Child's show()
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
