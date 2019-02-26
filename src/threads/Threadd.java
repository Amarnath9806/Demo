package threads;

public class Threadd extends Thread {
public void run() {
	System.out.println("start");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Threadd threadd = new Threadd();
threadd.start();
	}

}
