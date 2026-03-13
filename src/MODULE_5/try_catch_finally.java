package MODULE_5;
public class try_catch_finally {
    public static void main(String[] args) {
        try{
            int a=5/0;
        }
        catch(ArithmeticException e){
            System.out.println("exception occured");
        }
        finally{
            System.out.println("finally block executed");
        }
    }
}
