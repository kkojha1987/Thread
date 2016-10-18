package pack02;

public class MainClass {

	public static void main(String[] args) {
		ThreadEx01 th=new ThreadEx01();
		th.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");
		}

		ThreadEx02 th2=new ThreadEx02();
		Thread t1=new Thread(th2);
		t1.start();

	}

}
