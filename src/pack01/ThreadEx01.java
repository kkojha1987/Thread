package pack01;

public class ThreadEx01 implements Runnable{

	@Override
	public void run() {
		System.out.println("Start heavy processing"+ Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			doDBProcessing();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End heavy processing"+ Thread.currentThread().getName());
	}

	private void doDBProcessing() throws InterruptedException
	{
	
	Thread.sleep(5000);	
	}

}
