package MODULE13;
public class CheckBST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) { this.data = data; }
    }

    static boolean isBST(Node root, int min, int max) {
        if (root == null) return true;
        if (root.data <= min || root.data >= max) return false;
        return isBST(root.left, min, root.data) &&
                isBST(root.right, root.data, max);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);

        System.out.println("Is BST: " + isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}