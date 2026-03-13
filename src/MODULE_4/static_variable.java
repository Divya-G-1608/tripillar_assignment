package MODULE_4;
public class static_variable {
    static int count=0;
    static void display(){
        System.out.println("Static method called");
    }
    static_variable(){
        count++;
    }
    public static void main(String[] args) {
        static_variable s1= new static_variable();
        static_variable s2= new static_variable();
        display();
        System.out.println("Count: "+count);
    }
}
