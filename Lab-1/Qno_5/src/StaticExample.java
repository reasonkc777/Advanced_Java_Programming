//Qno5a Static Variables
class StaticExample {
    static int counter = 0;

    StaticExample() {
        counter++;
    }

    static void printCounter() {
        System.out.println("Counter: " + counter);
    }

    public static void main(String[] args) {
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();
        StaticExample.printCounter();  // Accessing static method
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
