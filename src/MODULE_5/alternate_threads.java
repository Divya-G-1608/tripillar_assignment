package MODULE_5;
class Thread2 extends Thread{
    public void run(){
        for(int i=1; i<=5;i+=2)
            System.out.println("Thread2: "+i);
    }
}
class Thread3 extends Thread{
    public void run(){
        for(int i=2;i<=6;i+=2)
            System.out.println("Thread3: "+i);
    }
}
public class alternate_threads {
    public static void main(String[] args) {
        Thread2 t2=new Thread2();
        Thread3 t3=new Thread3();
        t2.start();
        t3.start();

    }
}
