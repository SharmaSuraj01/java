public class Queue {
    int front;
    int rear;
    int[] arr;
    int cap;
    int size;
    public Queue(int cap){
        this.cap=cap;
        arr=new int[cap];
        front=0;
        rear=-1;
        size=0;
    }
    boolean isFull(){
        return size==cap;
    }
    boolean isEmpty(){
        return size==0;
    }
    void enqueue(int item){
        if(isFull()){
            System.out.println("Queue full");
            return;
        }
        rear=(rear+1)%cap;
        arr[rear]=item;
        size++;
    }
    int dequeue(){
        if(isEmpty()){
            System.out.println("Empty queue");
            return -1;
        }
        int item=arr[front];
        front=(front+1)%cap;
        size--;
        return item;
    }
    void Display(){
        if(isEmpty()){
            System.out.println("empty");
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[(front+i)%cap]+" ");
        }
        System.out.println();
    }
    int peek(){
        if(isEmpty()){
            System.out.println("No peek");
            return -1;
        }
        return arr[front];
    }
    public static void main(String[] args){
        Queue q=new Queue(10);
        q.enqueue(68);
        q.enqueue(78);
        q.enqueue(69);
        q.enqueue(50);
        q.enqueue(90);
        q.Display();
        q.dequeue();
        q.dequeue();
        q.Display();
        q.peek();
        q.Display();
        q.peek();
        q.Display();
    }
}
