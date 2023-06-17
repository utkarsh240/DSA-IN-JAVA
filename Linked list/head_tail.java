
public class head_tail {

    public static class Node{

        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node Tail;

    public void addfirst(int data){
        Node newNode =  new Node(data);

        if(head == null){
            head = Tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void addlast(int data){

        Node newNode = new Node(data);
        if(head == null){
            head=Tail=newNode;

        }
        Tail.next=newNode;
        Tail=newNode;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
        public static void main(String[] args) {
            head_tail ll = new head_tail();
            ll.addfirst(54);
            ll.addfirst(51);
            ll.addlast(11);
            ll.addlast(13);
            ll.print();

            
        }
    
    
}
