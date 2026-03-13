package MODULE_5;
public class exception_age_18 {
    public static void main(String[] args) {
        int age = 16;
        if(age<18){
            throw new ArithmeticException("not eligible to vote");
        }
        else{
            System.out.println("eligible to vote");
        }
    }
}
