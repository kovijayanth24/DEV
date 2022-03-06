package Jayanth;
public class Queue {
	public static void main(String[] args) 
	{
	        		Queue<String>locationsQueue = new Queue();
	locationsQueue.add("Kolkata");
	        		locationsQueue.add("Hyderabad");
	        		locationsQueue.add("Pune");
	        		locationsQueue.add("Chennai");
	        		locationsQueue.add("Banglore");
	System.out.println("Queue is : " + locationsQueue);
	        		System.out.println("Head of Queue : " + locationsQueue.peek());
	        		locationsQueue.remove();
	        		System.out.println("After removing Head of Queue : " + locationsQueue);
	        		System.out.println("Size of Queue : " + locationsQueue.size());
	    	}
	}
