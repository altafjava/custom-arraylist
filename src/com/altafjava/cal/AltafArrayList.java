package com.altafjava.cal;

import java.util.Arrays;

public class AltafArrayList {
	private Object[] elementData=new Object[0];
	private int i=0;
	
	public void add(Object o){
		if(elementData.length==0)
			increaseCapacity(10);
		if(i==elementData.length)
			increaseCapacity(elementData.length*3/2);
		elementData[i]=o;
		i++;
	}

	public Object remove(int index){
		Object o=elementData[index];
		elementData[index]=null;
		return o;
	}
	
	public boolean remove(Object obj){
		boolean b=false;
		for(int i=0;i<elementData.length;i++){
			if(obj.equals(elementData[i])){
				elementData[i]=null;
				b=true;
				break;
			}
		}
		return b;
	}
	
	private void increaseCapacity(int capacity){
		elementData=Arrays.copyOf(elementData, capacity);
	}

	@Override
	public String toString() {
		String s="[";
		for(Object o:elementData){
			if(o==null){
			}else{
				s=s+o+", ";
			}
		}
		if(i!=0)
			s=s.substring(0, s.length()-2);
		s=s+"]";
		return s;
	}
}
