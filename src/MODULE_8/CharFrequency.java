package MODULE_8;
public class CharFrequency {
    public static void main(String[] args) {
        String str = "hello";

        for(char c='a'; c<='z'; c++) {
            int count = 0;

            for(int i=0; i<str.length(); i++) {
                if(str.charAt(i) == c)
                    count++;
            }

            if(count > 0)
                System.out.println(c + " = " + count);
        }
    }
}
