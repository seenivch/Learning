package Thread;

class Hii implements Runnable{
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hi Executing");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class Helloo implements Runnable{
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello Executing");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class RunnableImpl {

	public static void main(String[] args) {
		Runnable hi = new Hi();
		Runnable hello = new Hello();
		Thread t1  = new Thread(hi);
		Thread t2  = new Thread(hello);
		t1.start();
		t2.start();
		
	}

}
