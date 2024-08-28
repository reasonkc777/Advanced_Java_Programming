//Qno12c Nested try examples

public class Nested_try_examples {
    public static void main(String[] args) {
        try {
            try {
                int data = 100 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception: " + e);
            }
            int[] arr = new int[5];
            arr[10] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception: " + e);
            System.out.println("Lab No.: 1\n" +
                    "Name: Nishchal K.C.\n");
        }
    }
}
