package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	public int size = 0;

	@Override
	public boolean add(T item) {
		if (size == items.length) {
			Object[] newArray = new Object[items.length * 2];
			for (int i = 0; i < items.length; i++) {
				newArray[i] = items[i];
			}
			items = newArray;
		}
		items[size++] = item;
		return true;
	}

	@Override
	public int getSize() {
		
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		if (index < 0 || index >= size) {
			return null;
		}
		return (T) items[index];
	
	}
	
}
