package Thread;

class Hi extends Thread{
	
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

class Hello extends Thread{
	
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

public class ThreadImpl {

	public static void main(String[] args) {
		Hi hi = new Hi();
		Hello hello = new Hello();
		hi.start();
		hello.start();
	}

}
