package Module11;
import java.util.Stack;

public class ReverseStack {
    static void insertAtBottom(Stack<Integer> s, int x) {
        if (s.isEmpty()) {
            s.push(x);
            return;
        }
        int temp = s.pop();
        insertAtBottom(s, x);
        s.push(temp);
    }

    static void reverse(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int temp = s.pop();
            reverse(s);
            insertAtBottom(s, temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);

        reverse(s);

        while (!s.isEmpty())
            System.out.print(s.pop() + " ");
    }
}
