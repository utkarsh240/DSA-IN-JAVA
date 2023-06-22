
public class add_value {

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
    public static int size;

    public void addfirst(int data){
        Node newNode =  new Node(data);
        size++;

        if(head == null){
            head = Tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void addlast(int data){

        Node newNode = new Node(data);
        size++;
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

        public void addpos(int pos , int data){
        if(pos==0){
            addfirst(data);
            return;
        }
        
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;

        while(i<pos-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next= newNode;
    }

        public static void main(String[] args) {
            add_value ll = new add_value();
            ll.addfirst(54);
            ll.addfirst(51);
            ll.addlast(11);
            ll.addlast(13);
            ll.addpos(2, 1);
            ll.print();
            System.out.println(ll.size);

            
        }
    
    
}
