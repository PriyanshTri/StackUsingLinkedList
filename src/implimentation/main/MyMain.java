package implimentation.main;

import implimentation.MyStack;

public class MyMain {

    public static void main(String[] args) {
        MyStack stk=new MyStack();
        System.out.println(stk.isEmpty());
        stk.push(5);
        stk.push(10);
        stk.push(15);
        stk.push(20);
        stk.push(25);
        System.out.println(stk.size());
        System.out.println(stk.isEmpty());
        System.out.println(stk.peek());
        System.out.println(stk.pop());
        System.out.println(stk.size());
        stk.traverse();
        System.out.println(stk.sizeByTraverse());

    }
}
