package com.map.zy.map.HashMap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
/*
 * ѧϰ�������Ҳ������Ǹ�hashCode��ֵ�����⣬ֻ���ҵ�һ������
 * �Ҿ�ѧϰ�������Ч�������Եģ����������Լ����������Լ��ķ�ʽ
 * �Լ���дд�����Ļ�����Լ���˼���ĳɷ�������,�ܶ���Ա仯�ģ���һ����
 * ģ����ѧ�õ���ʦ�Ĵ���д��
 */
public class ZyHashMap {
	LinkedList [] arr = new LinkedList[999];
	int size=0;
	public void put(Object key , Object value){
		ZyEntry zyEntry = new ZyEntry(key,value);
		int a = key.hashCode()%arr.length;
		if(arr[a]==null){
			ZyLinkedList list = new ZyLinkedList();
			arr[a]
		}
		
	}
	
	public static void main(String[] args) {
		String s = "123456";
		System.out.println(s.hashCode());
		Map map = new HashMap();
		
	}
}


class ZyEntry{
	private Object key;
	private Object value;
	public ZyEntry(Object key , Object value){
		this.key = key ;
		this.value = value;
		
	}
	
}