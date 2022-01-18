package com.codegym;

import java.util.ArrayList;
import java.util.List;

public class MyStack<E>{
    private List<E> elements = new ArrayList<>();

    public MyStack() {
    }
    public void push(E e) {
        elements.add(elements.size(), e);
    }
    public E pop() {
        if (elements.size() == 0) {
            throw new IndexOutOfBoundsException(" Stack đang không có phần tử nào");
        }
        return elements.remove(elements.size() - 1);// xoá phần tử cuối cùng và trả về phần tử đó.
    }
    public E peek() {
        return elements.get(elements.size() - 1) ;
    }

}
