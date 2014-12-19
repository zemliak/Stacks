package stack;

import java.util.*;

public class ListStack {
	List<Object> stack;
	public ListStack(int x){
		stack = new ArrayList<Object>();
	}
	public void push(Object o){
		try{
			stack.add(o);
		}
		catch(IndexOutOfBoundsException e){
			//do something
		}
	}
	public Object peek(){
		return stack.get(stack.size()-1);
	}
	public Object pop(){
		Object o = stack.get(stack.size()-1);
		stack.remove(stack.size()-1);
		return o;
	}
	public boolean isEmpty(){
		return (stack.size() == 0);
	}
	/*public boolean isFull(){
		return (stack.size() >= amount)
	}*/
}
