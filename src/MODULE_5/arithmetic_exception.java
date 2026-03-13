package MODULE_5;
public class arithmetic_exception {
    public static void main(String[] args) {
        try{
            int a=10, b=0;
            int c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero");
        }
    }
}
