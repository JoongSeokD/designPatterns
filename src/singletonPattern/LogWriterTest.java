package singletonPattern;

public class LogWriterTest {
	public static void main(String[] args) {
		for (int i = 0; i < 50; i++) {
			// �����帶�� ���еǴ� �α� �ۼ��� �Ķ����
			Thread t = new ThreadSub(i);
			t.start();
		}
	}
}

class ThreadSub extends Thread{
	int num;

	public ThreadSub(int num) {
		super();
		this.num = num;
	}
	
	@Override
	public void run() {
		LogWriter logger = LogWriter.getInstance();
		if (num < 10) {
			logger.log("*** 0" + num + " ***");
		} else {
			logger.log("*** " + num + " ***");
		}
	}
	
}
