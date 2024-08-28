//Qno9b Nonstatic nested class
class Outer_ {
    class Inner_ {
        void display() {
            System.out.println("Non-Static Inner Class");
        }
    }

    public static void main(String[] args) {
        Outer_ outer = new Outer_();
        Outer_.Inner_ inner = outer.new Inner_();
        inner.display();
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
