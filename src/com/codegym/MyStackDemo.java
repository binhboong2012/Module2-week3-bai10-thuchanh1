package com.codegym;

public class MyStackDemo {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        myStack .push(2);
        myStack .push(3);
        myStack .push(4);
        myStack .push(5);
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
    }
}
