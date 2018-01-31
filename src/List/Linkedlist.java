package List;

public class Linkedlist {

    Node head = null;
    class Node{
        Node next = null;
        int data;
        public Node(int data){
            this.data = data;
        }
    }
    //获取链表长度
    public int length() {
        int length = 0;
        Node tmp = head;
        while (tmp != null) {
            length++;
            tmp = tmp.next;
        }
        return length;
    }
    //增加节点
    public void addNode(int d){
        Node newNode = new Node(d);
        //空链表则增加为head
        if (head == null){
            head = newNode;
            return;
        }
        //非空链表增加到尾部
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    //删除第i个节点
    public boolean deleteNode(int i){
        if (i < 1 || i > length()){
            return false;
        }
        //node i-1 => node i+1
        int j = 2;
        Node preNode = head;
        Node curNode = preNode.next;
        while (curNode != null) {
            if (j == i) {
                preNode.next = curNode.next;
                return true;
            }
            preNode = curNode;
            curNode = curNode.next;
            j++;
        }
        return false;
    }
    //打印链表
    public void printList() {
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.addNode(5);
        list.addNode(3);
        list.addNode(1);
        list.addNode(2);
        list.addNode(55);
        list.addNode(36);
        list.printList();
        System.out.println("linkLength:" + list.length());
        System.out.println("head.data:" + list.head.data);
        list.deleteNode(3);
        System.out.println("After deleteNode(4):");
        list.printList();
    }




}
