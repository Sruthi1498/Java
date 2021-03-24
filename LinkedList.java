class Node{
    int data;
    Node next;
}
public class LinkedList {
    Node head;

    public void insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head== null)
        {
            head = node;
        }
        else
        {
            Node temp = head;
            while ((temp.next!=null))
            {
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    public void print()
    {
        Node n = head;
        while (n.next!=null)
        {
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insert(4);
        l.insert(6);
        l.insert(7);
        l.insert(8);

        l.print();
    }
}