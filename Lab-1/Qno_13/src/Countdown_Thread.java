// Qno13g: Thread that prints numbers from 100 to 1 every 3 seconds
class CountdownThread extends Thread {
    public void run() {
        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(3000);  // 3 seconds interval
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        CountdownThread t = new CountdownThread();
        t.start();
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
