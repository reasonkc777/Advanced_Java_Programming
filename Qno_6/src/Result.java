//Create classes for a student, test, and result, demonstrating inheritance
class Student {
    int rollNo;

    void readRollNo(int r) {
        rollNo = r;
    }

    void displayRollNo() {
        System.out.println("Roll No: " + rollNo);
    }
}

class Test extends Student {
    int marks1, marks2;

    void readMarks(int m1, int m2) {
        marks1 = m1;
        marks2 = m2;
    }

    void
    displayMarks() {
        System.out.println("Marks: " + marks1 + ", " + marks2);
    }
}

class Result extends Test {
    int total;

    void calculateTotal() {
        total = marks1 + marks2;
    }

    void displayTotal() {
        System.out.println("Total: " + total);
    }

    public static void main(String[] args) {
        Result r = new Result();
        r.readRollNo(101);
        r.readMarks(75, 85);
        r.calculateTotal();

        r.displayRollNo();
        r.displayMarks();
        r.displayTotal();
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
