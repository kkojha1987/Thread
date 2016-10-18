
package pack02;

public class JoinExample {

	public static void main(String[] args) {
	Thread t1=new Thread(	new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Thread -1");
					
				}
				
			}
		});
	Thread t2=new Thread(	new Runnable() {
		
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println("Thread -2");
				try {
					t1.join(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	});
	t1.start();
	t2.start();
	
	
	}
}
