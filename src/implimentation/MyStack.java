package implimentation;

import myinterface.StackADT;

public class MyStack implements StackADT {
    private Node top;
    //    to keep number of nodes
    private int size;

    public MyStack() {
        top = null;
        size = 0;
    }

    @Override
    public void push(int element) {
        Node node = new Node(element);
        node.setNext(top);
        top = node;
        size++;
    }

    @Override
    public int pop() {
        int response = 0;   //considering 0 as invalid data
        if (!isEmpty()) {
            response = top.getData();
            top = top.getNext();
            size--;
        }
        else{
            System.out.println("stack underflow!");
        }
        return response;
    }

    @Override
    public int peek() {
        int response=0;
        if(!isEmpty()){
            response=top.getData();
        }
        else{
            System.out.println("empty stack");
        }
        return response;
    }

    @Override
    public boolean isEmpty() {
        return top==null;
    }

    @Override
    public int size() {
        return size;
    }
    public void traverse(){
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.getData()+", ");
            temp=temp.getNext();
        }
        System.out.println();
    }
    public int sizeByTraverse(){
        Node temp=top;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.getNext();
        }
        return size;
    }
}
