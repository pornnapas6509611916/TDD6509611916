package core;

import java.util.ArrayList;

public class Stack implements IStack {
	
	private Object[] elems = new Object[3];
	private ArrayList<Object> elm = new ArrayList<>();
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isFull() {
		if(elems.length == 3)
			return true;
		else return false;
	}

	@Override
	public void push(Object element) {
		// TODO Auto-generated method stub
		elm.add(element);
	}
	
	@Override
	public Object top() {
		// TODO Auto-generated method stub
		return elm.get(elm.size()-1);
	}
	
	public void pop() {
		elm.remove(elm.get(elm.size()-1));
	}

}
