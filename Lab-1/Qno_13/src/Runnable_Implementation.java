//Qno13a Thread by Implementing Runnable
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread running");
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
