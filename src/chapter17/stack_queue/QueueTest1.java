package chapter17.stack_queue;

import java.util.ArrayList;

class MyQueue {
	private ArrayList<String> arrayQueue = new ArrayList<>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	public String deQueue() {
		int len = arrayQueue.size();	
		if(len == 0) {
			System.out.println("큐가 비어잇다");
			return null;
		}
		return(arrayQueue.remove(0));
	}
	
}

public class QueueTest1 {
	
	public static void main(String[] args) {
		
		MyQueue queue = new MyQueue();
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		
		
		
	}

}
