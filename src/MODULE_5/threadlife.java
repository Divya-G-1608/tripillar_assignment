package MODULE_5;
public class threadlife extends Thread{
    public void run(){
        System.out.println("Thread running");
    }

    public static void main(String[] args) {
        threadlife t=new threadlife();
        System.out.println("State: "+t.getState());
        t.start();
        System.out.println("State after start: "+t.getState());
    }
}
