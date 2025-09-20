package HashSet;

public class HashMap {
    public class Node{
        String key;
        Integer value;
        Node next;
    };
    private Node[] bucket;
    public int size;
    public HashMap(int n){
        bucket=new Node[n];
    }
    public HashMap(){
        bucket=new Node[4];
    }
    public int hasFunc(String key){
        int idx=key.hashCode()%bucket.length;
        if(idx<0){
            idx+= bucket.length;
        }
        return idx;
    }
    public void put(String key,Integer value){
        int bn=hasFunc(key);
        Node temp=bucket[bn];
        while(temp!=null){
            if(temp.key.equals(key)){
                temp.value=value;
                return ;
            }
            temp=temp.next;
        }
        Node nn=new Node();
        nn.value=value;
        nn.key=key;
        nn.next=bucket[bn];
        bucket[bn]=nn;
        size++;
    }
    public Integer get(String key){
        int bn=hasFunc(key);
        Node temp=bucket[bn];
        while(temp!=null){
            if(temp.key.equals(key)){
                return temp.value;
            }
            temp=temp.next;
        }
        return null;
    }
    public Boolean containKey(String key){
        int bn=hasFunc(key);
        Node temp=bucket[bn];
        while(temp!=null){
            if(temp.key.equals(key)){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public void Display(){
        for(int i=0;i<bucket.length;i++){
            Node temp=bucket[i];
            while (temp!=null){
                System.out.println(temp.key +"->"+temp.value);
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        HashMap map=new HashMap(5);
        map.put("Suraj",90);
        map.put("Priyanshu",50);
        map.put("Uttam",89);
        map.put("sameer",91);
        map.put("Aditya",85);
        map.Display();
    }
}
