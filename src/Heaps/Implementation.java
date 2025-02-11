package Heaps;

import java.util.*;

public class Implementation {
    ArrayList<Integer> list = new ArrayList<>();

    public void add(int data) {
        list.add(data);
        upheapify(list.size() - 1);
    }

    public void upheapify(int child) {
        if (child == 0) {
            return;
        }
        int parent = (child - 1) / 2;
        if (this.list.get(parent) < this.list.get(child)) {
            swap(parent, child);
            upheapify(parent);
        }
    }

    public void swap(int parent, int child) {
        int p=list.get(parent);
        int c=list.get(child);
        list.set(p,c);
        list.set(c,p);
    }
    public int size(){
        return list.size();
    }
    public int getmin(){
        return list.get(0);
    }

    public int remove() {
        swap(0, list.size()-1);
        int element= list.remove(list.size()-1);
        downHeapify(0);
        return element;
    }

    private void downHeapify(int parent) {
        if (parent == list.size() - 1) {
            return;
        }
        int leftChild = parent * 2 + 1;
        int rightChild = parent * 2 + 2;

        int temp = parent;

        if (leftChild<list.size() && list.get(temp) > list.get(leftChild)) {
            temp = leftChild;
        }
        if (rightChild<list.size()&&list.get(temp) > list.get(rightChild)) {
            temp = rightChild;
        }
        if (temp != parent) {
            swap(temp, parent);
            downHeapify(temp);
        }
    }
}
