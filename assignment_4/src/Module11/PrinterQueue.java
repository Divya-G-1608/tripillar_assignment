package Module11;
public class PrinterQueue {
    int front = 0, rear = -1;
    String arr[] = new String[100];

    void addJob(String job) {
        arr[++rear] = job;
    }

    void printJob() {
        if (front <= rear)
            System.out.println("Printing: " + arr[front++]);
        else
            System.out.println("No jobs");
    }

    void display() {
        for (int i = front; i <= rear; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        PrinterQueue p = new PrinterQueue();
        p.addJob("File1");
        p.addJob("File2");
        p.addJob("File3");

        p.printJob();
        p.display();
    }
}