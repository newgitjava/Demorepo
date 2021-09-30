package day11.learning;

import java.util.concurrent.ForkJoinPool;

public class App1 {

	public static void main(String[] args) {
		
		ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
		SimpleRecursiveAction1 simpleRecursiveAction = new SimpleRecursiveAction1(400);
		System.out.println( forkJoinPool.invoke(simpleRecursiveAction) );
		
		
	}
}

