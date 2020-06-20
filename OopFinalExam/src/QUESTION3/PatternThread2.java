//Developed by Hasindu Dahanayake
package QUESTION3;
//PatternThread2
public class PatternThread2 extends Thread {
	private String pattern;
	private int count;
	private int width;
	private Object lock;

	public PatternThread2(String pattern, int count, int width, Object lock) {// Overloaded Constructor

		this.pattern = pattern;
		this.count = count;
		this.width = width;
		this.lock = lock;

	}

	@Override
	public void run() {
		synchronized (lock) {/*
								 * Locking the code statements which are eligible to thread interference using a
								 * synchronized block with lock object
								 */

			for (int i = 0; i < count; i++) {
				System.out.print(Thread.currentThread()
						.getName());/*
									 * Printing the thread name which is currently on the running state
									 */
				for (int j = 0; j < width; j++) {
					System.out.print(pattern);// Printing the pattern
				}
				System.out.println();
				lock.notify();// Giving the lock for other thread which is waiting to acquire
				try {
					Thread.sleep(1000);// Sleeps for 1 second
				} catch (InterruptedException e) {

					e.printStackTrace();
				}

				try {
					lock.wait();// Waits till other thread calls on notify
				} catch (InterruptedException e) {

					e.printStackTrace();
				}

			}

		}
	}

}
