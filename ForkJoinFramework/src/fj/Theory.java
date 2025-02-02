package fj;

public class Theory {

	// Fork-Join Framework is an implementation of Executor Service Interface for
	// parallel execution

	/*
	 * 
	 * 
	 * Framework this framework helps to make an algorithm parallel we do not have
	 * to bother about low level synchronizations or locks it is a divide and
	 * conquer mechanism ‣ larger tasks can be divided into smaller ones and then we
	 * have to combine the subsolutions into the final solution of the problem ‣
	 * IMPORTANT: subtasks have to be independent in order to be executed in
	 * parallel so the main concept is that fork-join framework breaks the task into
	 * smaller subtasks until these subtasks are simple enough to solve without
	 * further breakups for example: parallel merge sort, parallel maximum finding
	 * 
	 * RecursiveTask<T> it returns a generic T type All the tasks we want to execute
	 * in parallel is a subclass of this class we have to override the compute()
	 * method that will return the solution of the subproblem
	 * 
	 * RecursiveAction it is a task, but without any return value
	 * 
	 * 
	 * ForkJoinPool 
	 * Basically it is a thread pool for executing fork-join tasks 
	 * work-stealing: a task is not equivalent to a thread!!!
	 * Tasks are lightweight threads so fork-join will be efficient even when
	 * there are a huge number of tasks 
	 * So ForkJoinPool creates a fix number of threads: usually the number of CPU cores 
	 * These threads are executing the tasks but if a thread has no task: it can „steal" a task from more busy
	 * threads - tasks are distributed to all threads in the thread pool 
	 * FORK-JOIN FRAMEWORK CAN HANDLE THE PROBLEM OF LOAD BALANCING QUITE EFFICIENTLY !!!
	 * 
	 * Fork: splits the given task into smaller subtasks that can be executed in a parallel manner
	 * Join: the splitted tasks are being executed and after all of them are finished and merged into one result
	 */

}
