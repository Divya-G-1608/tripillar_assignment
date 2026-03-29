package MODULE13;
public class BSTSearch {

    static class Node {
        int data;
        Node left, right;

        Node(int data) { this.data = data; }
    }

    static boolean search(Node root, int key) {
        if (root == null) return false;

        if (root.data == key) return true;

        if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    public static void main(String[] args) {

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);

        System.out.println("Search 30: " + search(root, 30));
    }
}