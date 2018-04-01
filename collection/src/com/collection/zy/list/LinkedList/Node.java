package com.collection.zy.list.LinkedList;


import java.util.LinkedList;
import java.util.List;

//源码中定义在类部类
public class Node {
	private Node prev;
	private Object item;
	private Node next;
	public Node(){
		
	}
	public Node(Node prev, Object element, Node next) {
        this.item = element;
        this.next = next;
        this.prev = prev;
    }

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
	
	
}
