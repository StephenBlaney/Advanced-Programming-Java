
import java.util.*;

public class ThreadWithRunnable implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {
			int[] numbers = { 1, 2, 3 };
			for (int y = 0; y < numbers.length; y++) {

				System.out.println((numbers[new Random().nextInt(numbers.length)]));

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}

		}

	}
}
