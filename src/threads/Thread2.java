package threads;

class Thread3 extends Thread {
	public void run() {
		for (int i = 0; i <25; i++) {
			System.out.println("thread 2");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Thread4 extends Thread {
	public void run() {
		for (int i = 0; i <25; i++) {
			System.out.println("thread 3");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Thread2{
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread3 thread3=new Thread3();
	
		Thread4 thread4 =new Thread4();
		thread3.start();
		thread4.start();
	}

}
 
