package com.collection.zy.list.ArrayList;

import java.io.Serializable;

public class ZyArrayList implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//	Java��serialization�ṩ��һ�ֳ־û�����ʵ���Ļ��ơ����־û�����ʱ��������һ������Ķ������ݳ�Ա�����ǲ�����serialization��������������
//	Ϊ����һ���ض������һ�����Ϲر�serialization�������������ǰ���Ϲؼ���transient��
//	��һ���������л���ʱ��transient�ͱ�����ֵ�����������л��ı�ʾ�У�Ȼ����transient�͵ı����Ǳ�������ȥ�ġ�
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
			//���������������copyһ�ݵ����µ����鵱��
			System.arraycopy(elementData, 0, newelementData , 0, elementData.length);
			elementData = newelementData;
		}
		elementData[size] = obj;
		size++;
	}
	public Object get(int index){
		return (Object) elementData[index];
	}
	
	//ɾ��remove
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
            throw new IndexOutOfBoundsException("�����±�Խ�� ��"+index);
    }
	public static void main(String[] args) {;
		ZyArrayList  zal = new ZyArrayList();
		zal.add("123");
		zal.add("4546");
		zal.add("hdjkfh");
		zal.add("long");
		
		Object[] obj = zal.elementData;
//		zal.remove(3);ɾ��
		System.out.println(zal.get(2));
		for (int i = 0; i < zal.size; i++) {
			System.out.println(obj[i]);
		}
		System.out.println(zal.size);
		
	}

}
