//Qno13e Synchronized Method
class Table {
    synchronized void printTable(int n) {  // Synchronized method
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread1 extends Thread {
    Table_ t;

    MyThread1(Table_ t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class MyThread2 extends Thread {
    Table_ t;

    MyThread2(Table_ t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}

public class TestSynchronization {
    public static void main(String args[]) {
        Table_ obj = new Table_();
        MyThread1_ t1 = new MyThread1_(obj);
        MyThread2_ t2 = new MyThread2_(obj);
        t1.start();
        t2.start();
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
