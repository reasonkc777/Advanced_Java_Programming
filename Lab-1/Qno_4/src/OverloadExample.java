//Qno 4a Method Overloading
class OverloadExample {
    void print(int num) {
        System.out.println("Integer: " + num);
    }

    void print(double num) {
        System.out.println("Double: " + num);
    }

    void print(String text) {
        System.out.println("String: " + text);
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();
        obj.print(10);
        obj.print(10.5);
        obj.print("Hello");
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
