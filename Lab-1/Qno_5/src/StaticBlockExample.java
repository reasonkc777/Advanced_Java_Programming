//Qno5c Static Blocks
class StaticBlockExample {
    static int number;

    static {
        number = 10;  // Static block for initialization
        System.out.println("Static block called");
    }

    public static void main(String[] args) {
        System.out.println("Number: " + number);
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
