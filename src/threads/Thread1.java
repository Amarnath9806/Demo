package threads;

public class Thread1 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread1 thread1=new Thread1();
Runnable thread =new Thread(thread1);
thread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("start");
	}

}
