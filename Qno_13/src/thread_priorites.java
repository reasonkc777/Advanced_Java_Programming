//Qno13d Thread Priorites
class thread_priorites extends Thread {
    public void run() {
        System.out.println("Thread running with priority: " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        thread_priorites t1 = new thread_priorites();
        thread_priorites t2 = new thread_priorites();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
