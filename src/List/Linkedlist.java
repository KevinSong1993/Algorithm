package List;

public class Linkedlist {

    Node head = null;
    static class Node{
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
    public void addNode(Node node){
        Node temp = head;
        if (head == null) {
            head = node;
            return;
        }
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }
    //插入节点到指定位置
    public void addNodeByIndex(int index,Node node) {
        Node temp = head;
        if (index < 1 || index > length()+1) {
            System.out.println("addNodeByIndex error");
            return;
        }
        for (int j = 1; j < index; j++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
    }
    //删除第i个节点
    public void deleteNodeByIndex(int index) {
        Node temp = head;
        if (index < 1 || index > length()) {
            System.out.println("deleteNodeByIndex error");
            return;
        }
        if (index == 1) {
            head = head.next;
            return;
        }
        for (int j = 2; j < index; j++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    //打印链表
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    //反转链表 将node i 指向node i-1
    public void reverseList() {
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        Node node1 = new Node(1);
        Node node2 = new Node(12);
        Node node3 = new Node(21);
        Node node4 = new Node(31);
        Node node5 = new Node(41);

        list.addNode(node1);
        list.addNode(node2);
        list.addNode(node3);
        list.addNode(node4);
        list.addNode(node5);

        list.printList();
        System.out.println("------------------------");
//        list.deleteNodeByIndex(1);
//
//        list.printList();

        list.addNodeByIndex(1,new Node(4));
        list.printList();


    }




}
