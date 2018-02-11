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
}
