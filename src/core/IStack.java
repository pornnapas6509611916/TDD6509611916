package core;

public interface IStack {
	boolean isEmpty();
	int getSize();
	void push (Object element);
	boolean isFull();
	Object top();
	

}
