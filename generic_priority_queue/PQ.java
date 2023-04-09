package pq;

import java.util.ArrayList;

public class PQ <E extends Comparable <? super E>>{
	private ArrayList<E>list = new ArrayList<E>();
	
	public void insert(E item) {
		list.add(item);
	}
	
	public E min() {
		E startingItem = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			E currentItem = list.get(i);
			if (list.get(i).compareTo(startingItem) < 0) {
				startingItem = currentItem;
			}
		}
		return startingItem;
	}
	
	public E removeMin() {
		E startingItem = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			E currentItem = list.get(i);
			if (list.get(i).compareTo(startingItem) < 0) {
				startingItem = currentItem;
			}
		}
		list.remove(startingItem);
		return startingItem;
	}
	
	public int size() {
		return list.size();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
}