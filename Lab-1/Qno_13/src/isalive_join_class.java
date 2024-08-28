//Qno13c isAlive() and join() Methods
class isalive_join_class extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        isalive_join_class t1 = new isalive_join_class();
        isalive_join_class t2 = new isalive_join_class();
        t1.start();
        try {
            t1.join();  // Waiting for t1 to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        t2.start();
        System.out.println("Thread t1 is alive: " + t1.isAlive());
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
