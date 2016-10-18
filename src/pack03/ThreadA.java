package pack03;

public class ThreadA {

	public static void main(String[] args) throws InterruptedException {
		ThreadB b=new ThreadB();
		b.start();
		
System.out.println(b.total);
	}

}
