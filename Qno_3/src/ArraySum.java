//Qno3a Single Dimension Array
public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = new int[15];
        for (int i = 0; i < 15; i++) {
            numbers[i] = i + 1;  // Storing first 15 natural numbers
        }
        int sum = numbers[2] + numbers[14];  // Sum of 3rd and last element
        System.out.println("Sum of 3rd and last element: " + sum);
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
