package stack;

import java.util.*;
//should they be resizeable? This is not resizeable
public class ListQueue {
	List<Object> queue;
	int head;
	int tail;
	public ListQueue(int n){
		queue = new ArrayList<Object>();
		head = 0;
		tail = 0;
	}
	public void enqueue(Object o){
		queue.add(tail,o);
		tail++;
	}
	public Object dequeue(){
		return queue.remove(0);
	}
	public Object peek(){
		return queue.get(0);
	}
	
}
