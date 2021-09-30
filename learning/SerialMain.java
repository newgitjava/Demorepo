package day10.learning;


class Task{
	
	public void doTask() {
		for(int i=0; i<=500;i++) {
			System.out.print("B");
		}
	}
}


public class SerialMain {

	//Runs with in main thread started by JVM.
	public static void main(String[] args) {
		
		for(int i=0; i<=500;i++) {
			System.out.print("A");
		}
		
		
		Task t1 = new Task();
		t1.doTask();
			
	}

}
