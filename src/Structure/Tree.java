package Structure;

public class Tree {
    private Node root = null;
    private static class Node {
        private int data;
        private Node leftchild;
        private Node rightchild;
        private Node(int data) {
            this.data = data;
        }
    }
    public Node find(int data) {
        Node current = root;
        while (current != null) {
            if (current.data > data) {
                current = current.leftchild;
            } else if (current.data < data) {
                current = current.rightchild;
            } else {
                return current;
            }
        }
        return null;
    }
    public Boolean insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return true;
        } else {
            Node current = root;
            Node parentNode = null;
            while (current != null) {
                parentNode = current;
                if (current.data > data) {
                    current = current.leftchild;
                    if (current == null) {
                        parentNode.leftchild = newNode;
                        return true;
                    }
                } else if (current.data < data) {
                    current = current.rightchild;
                    if (current == null) {
                        parentNode.rightchild = newNode;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public Node findMax() {
        Node current = root;
        Node maxNode = current;
        while (current != null){
            maxNode = current;
            current = current.rightchild;
        }
        return maxNode;
    }

    public Node findMin() {
        Node current = root;
        Node minNode = current;
        while (current != null){
            minNode = current;
            current = current.leftchild;
        }
        return minNode;
    }
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(50);
        tree.insert(20);
        tree.insert(80);
        tree.insert(10);
        tree.insert(30);
        tree.insert(60);
        tree.insert(90);
        tree.insert(25);
        tree.insert(85);
        tree.insert(100);
        System.out.println(tree.findMax().data);
        System.out.println(tree.findMin().data);
        System.out.println(tree.find(100));
        System.out.println(tree.find(200));

    }
}
