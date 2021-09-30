package day10.learning;

class Task1 extends Thread{
	
	public void run() {
		doTask();
	}
	
	public void doTask() {
		for(int i=0; i<=2500;i++) {
			System.out.print("B");
		}
	}
	
}


public class ParallelMain {
	
	//Runs with in main thread started by JVM
	public static void main(String[] args) {
		
		Task1 t1 = new Task1();
		//starts a separate thread by using start() of Thread class
		t1.start();

		
		for(int i=0; i<=2500;i++) {
			System.out.print("A");
		}

	}

}
