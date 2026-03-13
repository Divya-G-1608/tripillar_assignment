package MODULE_4;
public class String_difference {
    public static void main(String[] args) {
        String s = "Hello";
        s.concat("java");
        System.out.println("String: "+s);
        StringBuilder sb=new StringBuilder("hello");
        sb.append("java");
        System.out.println("StringBuilder: "+sb);
        StringBuffer sbf=new StringBuffer("hello");
        sbf.append("java");
        System.out.println("StringBuffer: "+sbf);
    }
}
