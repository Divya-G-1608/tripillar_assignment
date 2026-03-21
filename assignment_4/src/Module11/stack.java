package Module11;
class StackArray {
    int top = -1;
    int arr[] = new int[100];

    void push(int x) {
        arr[++top] = x;
    }

    int pop() {
        return arr[top--];
    }

    void display() {
        for (int i = top; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        StackArray s = new StackArray();
        s.push(10);
        s.push(20);
        s.push(30);
        s.pop();
        s.display();
    }
}