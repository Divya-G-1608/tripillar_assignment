package Module8;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "Hello World";
        String[] words = str.split(" ");

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            System.out.print(sb.reverse() + " ");
        }
    }
}