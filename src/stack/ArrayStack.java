package stack;

public class ArrayStack {
	Object [] stack;
	int size;
	int amount;
	public ArrayStack(int x){
		stack = new Object[x];
		size = x;
		amount = 0;
	}
	public void push(Object o)throws IndexOutOfBoundsException{
		try{
			stack[amount] = o;
			amount++;
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("try again");
		}
	}
	public Object pop(){
		amount--;
		Object o = stack[amount];
		stack[amount] = null;
		return o;
	}
	public Object peek(){
		return stack[amount-1];
	}
	public boolean isFull(){
		return(amount >= size);
	}
	public boolean isEmpty(){
		return(amount == 0);
	}
	public String toString(){
		String answer = "";
		for(int i = size-1; i >= 0; i--){
			if(stack[i] != null)
			answer += stack[i] + "\n";
		}
		return answer;
	}
}
