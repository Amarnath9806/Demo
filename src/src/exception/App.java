package exception;

public class App {
	public static void main(String[] args) {
		try {
			throw new Custom();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
