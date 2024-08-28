//Qno12d Throw Keyword
public class Throw_Keyword {
    static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not valid for voting");
        } else {
            System.out.println("Welcome to vote");
        }
    }

    public static void main(String[] args) {
        validate(19);
        System.out.println("Rest of the code...");
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
