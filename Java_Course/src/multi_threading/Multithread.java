/*
There are two ways to create thread
1. By extending the thread class
2. By implementing the runnable interface 
*/

// java code for thread creation by extending the thread class
package multi_threading;
class MultithreadingDemo extends Thread{
	public void run() {
		try {
			//Displaying the thread that is running
			System.out.println("Thread"+Thread.currentThread().getId()+"is running");
		}
		catch (Exception e) {
			// throwing an exception
			System.out.println("Exception is caught");
		}
	}
}
public class Multithread {
	public static void main(String[] args) {
		// number of threads
		int n = 8; 
		for(int i = 0; i<n; i++) {
			MultithreadingDemo object = new MultithreadingDemo();
			object.start();
		}
	}
}
