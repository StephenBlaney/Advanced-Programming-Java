
public class TestThread {
	public static void main(String[] args) {

		{
			  Thread thread = new Thread(new ThreadWithRunnable());
			  thread.start();

		}
	}
}
