//Qno13b  Thread by Extending Thread Class
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running");
    }

    public static void main(String[] args) {
        isalive_join_class thread = new isalive_join_class();
        thread.start();
        System.out.println("Lab No.: 1\n" +
                "Name: Nishchal K.C.\n");
    }
}
