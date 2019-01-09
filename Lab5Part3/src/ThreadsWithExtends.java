
import java.util.Random;

public class ThreadsWithExtends extends Thread {

	static String[] letters = { "A", "B", "C" };

	public ThreadsWithExtends(String str) {
		super(str);

	}

	public synchronized void run() {

		for (int i = 0; i < 10; i++) {
			for (int y = 0; y < letters.length; y++) {
				synchronized (letters) {
					System.out.println((letters[new Random().nextInt(letters.length)] + getName()));
				}

				try {
					sleep((long) (Math.random() * 1000));// waits 1 second
				} catch (InterruptedException e) {
				}
			}
			System.out.println(getName());
		}
	}
}
