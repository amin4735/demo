package com.zrm.demo.thinkInJava.generic;

/**
 * @author amin
 * @since 2019-07-20
 * @param <T>
 */
public class LinkedStack<T> {
    private static class Node<U>{
        U item;
        Node<U> next;

        Node(){
            item = null;
            next = null;
        }

        Node(U item, Node<U> next){
            this.item = item;
            this.next = next;
        }

        boolean end(){
            return item==null && next==null;
        }
    }

    private Node<T> top = new Node<T>(); // End sentinel,末端哨兵

    public void push(T item){
        top = new Node(item, top);
    }

    public T pop(){
        T result = top.item;
        if(!top.end())
            top = top.next;
        return result;
    }
}
