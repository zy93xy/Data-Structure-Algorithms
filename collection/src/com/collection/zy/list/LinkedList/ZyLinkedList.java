package com.collection.zy.list.LinkedList;

import java.util.Collection;

public class ZyLinkedList<E> {
		transient int size = 0;
		private Node first;
		private Node last ;
		//这里必须要考虑链表的头和链表的尾，头前没有上一个node，尾没有下一个node
		
		 public ZyLinkedList() {
			 
		    }
		 
		 public  ZyLinkedList(Collection<?>  c){
			 this();
			 add(c);
		 }
		 public void add(Object obj) {
//		        checkPositionIndex(index);
		        Node node =  new Node();
		        if (first == null){
		        	//当first为空时，使得first和last都是同一个node
		        	node.setPrev(null);
		        	node.setItem(obj);
		        	node.setNext(null);
		        	first=node;
		        	last=node;
		        }else{
		        	//直接往last节点
		        	node.setPrev(last);
		        	//由于last的前一个的节点不为空，所以前面的node数据last数据是当前的node的开始
		        	node.setItem(obj);
		        	node.setNext(null);
		        	
		        	last.setNext(node); //最后把last的数据变成当前的node的值替换前一个的node
		        	last = node;
		        }
		          size++;
		    }
		
//		private void checkPositionIndex(int index) {
//	        if (!isPositionIndex(index))
//	            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
//	    }
		private String outOfBoundsMsg(int index) {
	        return "Index: "+index+", Size: "+size;
	    }

		//
	    private boolean isPositionIndex(int index) {
	        return index >= 0 && index <= size;
	    }
	    
	    public int size(){
	    	return size;
	    }
		public static void main(String[] args) {
			ZyLinkedList zll = new ZyLinkedList();
			zll.add("zhangyang");
			zll.add("zhangtao");
			System.out.println("size : "+zll.size());
		}
}
