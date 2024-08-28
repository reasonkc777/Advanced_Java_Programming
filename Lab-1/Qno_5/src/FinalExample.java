//Qno5d Final Keyword Implementation

class FinalExample {
    final int CONSTANT = 100;

    final void display() {
        System.out.println("This is a final method.");
    }

    public static void main(String[] args) {
        FinalExample obj = new FinalExample();
        System.out.println("Constant: " + obj.CONSTANT);
        obj.display();
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
