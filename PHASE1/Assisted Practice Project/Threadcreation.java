package Jayanth;
	public class Threadcreation extends Thread
	{
	 	public void run()
	 	{
	  		System.out.println("concurrent thread started running..");
	}
	 	public static void main( String args[] )
	 	{
	  		Threadcreation mt = new  Threadcreation();
	  		mt.start();
	 	}
	}
