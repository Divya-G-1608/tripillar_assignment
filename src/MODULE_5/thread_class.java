package MODULE_5;
public class thread_class extends Thread {
    public void run(){
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
        thread_class t = new thread_class();
        t.start();
    }
}
