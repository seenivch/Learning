package Thread;

public class LambdaRunnable {

	public static void main(String[] args) throws InterruptedException {
		Thread t1  = new Thread(() ->{
			for(int i=1;i<=5;i++) {
				System.out.println("Hi Executing");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		Thread t2  = new Thread(()-> {
			for(int i=1;i<=5;i++) {
				System.out.println("Hello Executing");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
		
		t1.join(); // Waiting a thread to die
		t2.join();
		
		System.out.println(t1.isAlive());
		System.out.println("Bye");
	}

}
