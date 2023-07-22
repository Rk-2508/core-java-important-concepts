// java code for thread creation by implementing the runnable interface
package multi_threading;
class MultithreadingDemo1 implements Runnable{
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

public class Multithread1 {
public static void main(String[] args) {
	//Number of threads
	int n = 8;
	for(int i=0; i<n; i++) {
		Thread object = new Thread(new MultithreadingDemo());
		object.start();
		}
	}
}
