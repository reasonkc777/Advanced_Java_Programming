//Qno9a Static Nested Class
class Outer {
    static class StaticNested {
        void display() {
            System.out.println("Static Nested Class");
        }
    }

    public static void main(String[] args) {
        Outer.StaticNested nested = new Outer.StaticNested();
        nested.display();
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
