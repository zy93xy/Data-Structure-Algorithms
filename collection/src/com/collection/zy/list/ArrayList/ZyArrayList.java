package com.collection.zy.list.ArrayList;

import java.io.Serializable;

public class ZyArrayList implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//	Java的serialization提供了一种持久化对象实例的机制。当持久化对象时，可能有一个特殊的对象数据成员，我们不想用serialization机制来保存它。
//	为了在一个特定对象的一个域上关闭serialization，可以在这个域前加上关键字transient。
//	当一个对象被序列化的时候，transient型变量的值不包括在序列化的表示中，然而非transient型的变量是被包括进去的。
	private transient Object[] elementData;
	
	private int size=0;
	
    private static final int DEFAULT_CAPACITY = 2;
	
    public ZyArrayList(){
    	this(DEFAULT_CAPACITY);
    }
	public ZyArrayList (int initialCapacity){
	
		if(initialCapacity<size){
			throw new IllegalArgumentException("Illegal initialCapacity :"+initialCapacity);
		}
		elementData = new Object[initialCapacity];
	}
	
	public void add(Object obj){
		Object[]  newelementData = null;
		if(size==elementData.length){
			newelementData = new Object[size*2+1];
			//增大容器后对数据copy一份到最新的数组当中
			System.arraycopy(elementData, 0, newelementData , 0, elementData.length);
			elementData = newelementData;
		}
		elementData[size] = obj;
		size++;
	}
	public Object get(int index){
		return (Object) elementData[index];
	}
	
	//删除remove
	public Object remove(int index){
		rangeCheck(index);
		Object oldValue = elementData[index];
		
		int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(elementData, index+1, elementData, index,
                             numMoved);
        elementData[--size] = null; // clear to let GC do its work
        return oldValue;
		
	}
	private void rangeCheck(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException("数组下标越界 ："+index);
    }
	public static void main(String[] args) {;
		ZyArrayList  zal = new ZyArrayList();
		zal.add("123");
		zal.add("4546");
		zal.add("hdjkfh");
		zal.add("long");
		
		Object[] obj = zal.elementData;
//		zal.remove(3);删除
		System.out.println(zal.get(2));
		for (int i = 0; i < zal.size; i++) {
			System.out.println(obj[i]);
		}
		System.out.println(zal.size);
		
	}

}
