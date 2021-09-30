package day11.learning;


import java.util.concurrent.RecursiveTask;

public class SimpleRecursiveAction1 extends RecursiveTask<Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int simulatedWork;
	
	public SimpleRecursiveAction1(int simulatedWork) {
		this.simulatedWork = simulatedWork;
	}
	
	@Override
	protected Integer compute() {
		
		if( simulatedWork > 100 ) {
			
			System.out.println("Parallel execution and split the tasks..." + simulatedWork);
			
			SimpleRecursiveAction1 simpleRecursiveAction1 = new SimpleRecursiveAction1(simulatedWork/2);
			SimpleRecursiveAction1 simpleRecursiveAction2 = new SimpleRecursiveAction1(simulatedWork/2);
			
			simpleRecursiveAction1.fork();
			simpleRecursiveAction2.fork();
			
			int solution = 0;
			solution = solution + simpleRecursiveAction1.join();
			solution = solution + simpleRecursiveAction2.join();
			
			return solution;
			
		} else {
			System.out.println("No need for parallel execution, sequential is OK for this task..." );
			return 2 * simulatedWork;
		}
	}
}

