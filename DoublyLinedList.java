class Node {
        int data;
        Node next;
        Node prev;
     Node(int data){
    this.data=data;
    }
}
public class DoublyLinedList{
     Node head;

     public void addFirst(int data){
         Node dummy=new Node(data);
         if(head==null){
             head=dummy;
             return;
         }
         dummy.next=head;
         head.prev=dummy;
         head=dummy;
     }

     public void addLast(int data){
         Node dummy=new Node(data);
         if(head == null){
             head=dummy;
             return;
         }
         Node temp=head;
         while(temp.next!=null){
             temp=temp.next;
         }
         temp.next=dummy;
         dummy.prev=temp;
     }
     public void deleteFirst(){
         if(head==null){
             System.out.println("empty");
             return;
         }
         head=head.next;
         if (head.next!=null){
             head.prev=null;
         }
     }
     public void deleteLast(){
         if(head==null){
             System.out.println("emnpty");
             return;
         }
         if(head.next==null){
             head=null;
             return;
         }
         Node temp=head;
         while(temp.next!=null){
             temp=temp.next;
         }
         temp.prev.next=null;
     }

     public int search(int data){
         Node temp=head;
         while(temp.next!=null){
             if(temp.data==data){
                 return data;
             }
             temp=temp.next;
         }
         return 0;
     }
     public void display(){
         Node temp=head;
         while(temp!=null){
             System.out.print(temp.data+"->");
             temp=temp.next;
         }
         System.out.println();
     }

    public static void main(String[] args) {
        DoublyLinedList dl=new DoublyLinedList();
        dl.addFirst(10);
        dl.addFirst(15);
        dl.addFirst(20);
        dl.addFirst(25);
        dl.display();
//        dl.addLast(10);
//        dl.addLast(1045);
//        dl.addLast(1022);dl.addLast(105);
//        dl.display();
    }
}
