//Qno12f Custom Keyword

class CustomException extends Exception {
    CustomException(String s) {
        super(s);
    }
}

public class Custom_Keyword {
    public static void main(String[] args) {
        try {
            throw new CustomException("Custom Exception Occurred");
        } catch (CustomException e) {
            System.out.println("Caught: " + e.getMessage());
        }
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
