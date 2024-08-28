//Create a class "Money" with methods to set, display, and add money, along with a test class "MoneyTest"
class Money {
    int rupee, paisa;

    // Method to set money
    void setMoney(int r, int p) {
        rupee = r;
        paisa = p;
    }

    // Method to display money
    void displayMoney() {
        System.out.println("Money: " + rupee + " Rupee, " + paisa + " Paisa");
    }

    // Method to add two Money objects
    void addMoney(Money m1, Money m2) {
        int totalPaisa = m1.paisa + m2.paisa;
        this.paisa = totalPaisa % 100;
        this.rupee = m1.rupee + m2.rupee + totalPaisa / 100;
    }
}

public class Main {
    public static void main(String[] args) {
        Money m1 = new Money();
        Money m2 = new Money();
        Money m3 = new Money();

        m1.setMoney(5, 75);
        m2.setMoney(7, 30);

        m3.addMoney(m1, m2);

        m1.displayMoney();
        m2.displayMoney();
        m3.displayMoney();
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
