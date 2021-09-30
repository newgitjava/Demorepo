package day11.learning;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class AppMaxFind {

	public static int THREASHOLD = 0;
	
	public static void main(String[] args) {
		
		long[] nums = initializeNums();
		THREASHOLD =  nums.length / Runtime.getRuntime().availableProcessors();
		
		SequentialMaxFind normalMaxFind = new SequentialMaxFind();
		
		long start = System.currentTimeMillis();
		System.out.println("Max: " + normalMaxFind.sequentialMaxFinding(nums, nums.length));
		System.out.println("Time taken by sequential approach: " + (System.currentTimeMillis() - start) + "ms");

		System.out.println();
		
		ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
		MaximumFindTask findTask = new MaximumFindTask(nums, 0, nums.length);
		
		start = System.currentTimeMillis();
		System.out.println("Max: " + forkJoinPool.invoke(findTask));
		System.out.println("Time taken by fork join: " + (System.currentTimeMillis() - start) + "ms");
	}

	private static long[] initializeNums() {
		
		Random random = new Random();
		
		//200000000
		long[] nums = new long[200000000];
		
		for(int i=0;i<200000000;++i)
			nums[i] = random.nextInt(100);
		
		return nums;
	}
}
