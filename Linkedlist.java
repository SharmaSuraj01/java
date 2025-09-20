import java.util.*;
public class Linkedlist {
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;

    }
    void add(int val){
        Node node=new Node();
       node.data= val;
       if(val==0){
           head=node;
           tail=node;

       }else{
           node.next=head;
           head=node;
       }
    }
    void last(int val){
        Node node=new Node();
        node.data= val;
        if(val==0){
            head=node;
            tail=node;

        }else{
            while (head.next!=null){
             head=head.next;
            }
            node.next=tail;
            tail=node;
        }
    }
    void display(){
        while(head!=null){
            System.out.println(head.data+"->");

            head=head.next;
        }
    }

    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.add(57);
        ll.add(27);
        ll.add(97);
        ll.add(17);
        ll.last(545);
        ll.display();
    }
}
