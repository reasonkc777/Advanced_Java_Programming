//Qno12b Multiple Catch Example

public class Multiple_Catch_Example {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception: " + e);
        }
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
