package pack01;

public class MainClass {

	public static void main(String[] args) {
		  Thread t1 = new Thread(new ThreadEx01(), "t1");
	        Thread t2 = new Thread(new ThreadEx01(), "t2");
	        System.out.println("Starting Runnable threads");
	        t1.start();
	        t2.start();
	        System.out.println("Runnable Threads has been started");
	        Thread t3 = new ThreadEx02("t3");
	        Thread t4 = new ThreadEx02("t4");
	        System.out.println("Starting MyThreads");
	        t3.start();
	        t4.start();
	        System.out.println("MyThreads has been started");
	}

}
