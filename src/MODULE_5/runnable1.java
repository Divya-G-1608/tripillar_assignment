package MODULE_5;
public class runnable1 implements Runnable{
    public void run(){
        System.out.println("thread using Runnable interface");
    }

    public static void main(String[] args) {
        runnable1 r= new runnable1();
        Thread t=new Thread(r);
        t.start();
    }
}
