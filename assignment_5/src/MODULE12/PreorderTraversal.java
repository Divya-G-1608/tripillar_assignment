package MODULE12;
public class PreorderTraversal {

    static class Node {
        int data;
        Node left, right;

        Node(int data) { this.data = data; }
    }

    static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        preorder(root);
    }
}