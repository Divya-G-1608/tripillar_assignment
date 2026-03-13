package MODULE_8;
public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "programming";
        String result = "";

        for(int i=0;i<str.length();i++) {
            char c = str.charAt(i);

            if(result.indexOf(c) == -1)
                result += c;
        }

        System.out.println(result);
    }
}