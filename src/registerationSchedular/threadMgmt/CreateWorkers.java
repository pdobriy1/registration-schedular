package registerationSchedular.threadMgmt;

import registerationSchedular.util.Logger;
import registerationSchedular.scheduling.course_alloc;
import registerationSchedular.store.Results;
import registerationSchedular.util.FileProcessor;

public class CreateWorkers {
	
	private FileProcessor fp;
	private Results results;
	private course_alloc CourseAllocObj;
	
	public CreateWorkers(FileProcessor fpln,Results resultsln,course_alloc course_alloc_obj){
			fp = fpln;
			results = resultsln;
			CourseAllocObj = course_alloc_obj;
			Logger.writeMessage("Constructor invoked: " + this.getClass().getName(), Logger.DebugLevel.CONSTRUCTOR);

	}
	/*
	 * Create threads and call the start method
	 */
	public void startWorkers(int numthreads){
		
		try{
			Thread[] thread = new Thread[numthreads];
			for(int i = 0;i < numthreads;i++){
				thread[i] = new Thread(new WorkerThread(fp,results,CourseAllocObj));
				thread[i].start();
			}
			for(int j = 0;j < numthreads;j++){
				thread[j].join();
			}
			
		}
		catch(InterruptedException iex){
			System.out.println("Thread interrupted with exception");
			iex.printStackTrace();
			System.exit(1);
		}
	}

	

}
