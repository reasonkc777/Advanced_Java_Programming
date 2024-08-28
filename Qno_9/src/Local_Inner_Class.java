//Qno9c Local Inner Class Implementation
class Outer__ {
    void outerMethod() {
        class LocalInner {
            void display() {
                System.out.println("Local Inner Class");
            }
        }
        LocalInner inner = new LocalInner();
        inner.display();
    }

    public static void main(String[] args) {
        Outer__ outer = new Outer__();
        outer.outerMethod();
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
