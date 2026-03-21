package Module11;
import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        String str = "{[()]}";
        Stack<Character> s = new Stack<>();
        boolean flag = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[')
                s.push(ch);
            else {
                if (s.isEmpty()) {
                    flag = false;
                    break;
                }
                char top = s.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    flag = false;
                    break;
                }
            }
        }

        if (!s.isEmpty())
            flag = false;

        if (flag)
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}
