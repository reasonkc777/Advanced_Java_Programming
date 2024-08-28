//Qno13h Thread that prints numbers from 1 to 10 every 2 seconds
class CountingRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);  // 2 seconds interval
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new CountingRunnable());
        t.start();
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
