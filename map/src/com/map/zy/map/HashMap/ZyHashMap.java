package com.map.zy.map.HashMap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
/*
 * 学习到这里我不明白那个hashCode的值的问题，只是我的一个问题
 * 我就学习到这里的效果不明显的，所以我想自己多少想象，自己的方式
 * 自己多写写这样的会更有自己的思考的成份在里面,很多可以变化的，第一版是
 * 模拟尚学堂的老师的代码写的
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