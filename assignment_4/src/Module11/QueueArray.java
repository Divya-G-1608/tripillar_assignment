package Module11;
public class QueueArray {
    int front = 0, rear = -1;
    int arr[] = new int[100];

    void enqueue(int x) {
        arr[++rear] = x;
    }

    int dequeue() {
        return arr[front++];
    }

    void display() {
        for (int i = front; i <= rear; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.dequeue();
        q.display();
    }
}