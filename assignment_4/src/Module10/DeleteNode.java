package Module10;
class nodes {
    int data;
    nodes next;

    nodes(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteNode {
    static nodes head = null;

    static void delete(int key) {
        if (head == null)
            return;

        if (head.data == key) {
            head = head.next;
            return;
        }

        nodes temp = head;
        while (temp.next != null && temp.next.data != key)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    public static void main(String[] args) {
        head = new nodes(10);
        head.next = new nodes(20);
        head.next.next = new nodes(30);

        delete(20);

        nodes temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
