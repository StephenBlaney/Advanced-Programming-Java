
import java.util.Random;

public class ThreadWithExtends extends Thread {
	static String[] letters = { "A", "B", "C" };

	public ThreadWithExtends(String str) {
		super(str);
	}

	public void run() {
		
		for (int i = 0; i < 10; i++) {
			for (int y = 0; y < letters.length; y++) {

				System.out.println((letters[new Random().nextInt(letters.length)] + getName()));

				try {
					sleep((long) (Math.random() * 1000));// waits 1 second
				} catch (InterruptedException e) {
				}
			}
			System.out.println(getName());
		}
	}
}