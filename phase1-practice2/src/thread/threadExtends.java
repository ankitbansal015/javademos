package thread;

public class threadExtends extends Thread
{
 	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
 		threadExtends mt = new  threadExtends();
  		mt.start();
 	}
}

