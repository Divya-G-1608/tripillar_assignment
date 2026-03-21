package Module10;
class Module10 {
    int data;
    nodes next;

    Module10(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertEnd {
    static nodes head = null;

    static void insert(int data) {
        nodes newNode = new nodes(data);
        if (head == null) {
            head = newNode;
            return;
        }
        nodes temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);

        nodes temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}