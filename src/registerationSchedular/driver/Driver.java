package registerationSchedular.driver;

import java.io.FileNotFoundException;

import registerationSchedular.scheduling.course_alloc;
import registerationSchedular.store.Results;
import registerationSchedular.threadMgmt.CreateWorkers;
import registerationSchedular.util.FileProcessor;
import registerationSchedular.util.Logger;

public class Driver {

	public static void main(String[] args) {
		
		if(args.length > 4 || args.length < 4){
			System.out.println("Incorrect number of arguments provided");
			System.exit(1);
		}
		try{
			if(Integer.parseInt(args[2]) < 1 || Integer.parseInt(args[2]) > 3){
				System.out.println("Can create threads between 1 and 3");
				System.exit(1);
			}
			
			if(Integer.parseInt(args[3]) < 0 || Integer.parseInt(args[3]) > 4){
				System.out.println("Can display debug values between 0 and 4");
				System.exit(1);
			}
			
		}
		catch(NumberFormatException nfe){
			System.out.println("cannot convert argument into integer");
			nfe.printStackTrace();
			System.exit(1);
			
		}
		finally{
			
		}
		
		FileProcessor fp = null;
		String inputfilename = args[0].toString();
		try{
			fp = new FileProcessor(inputfilename);
			
		}
		catch (FileNotFoundException fe) {
			System.out.println("File not found ");
			fe.printStackTrace();
			System.exit(1);
		}
		finally{
			
		}
		String outputfilename = args[1].toString();
		Results result = new Results(outputfilename);
		course_alloc course_alloc_obj = new course_alloc();
		
		CreateWorkers create_workers = new CreateWorkers(fp,result,course_alloc_obj);
//		System.out.println(Integer.parseInt(args[2]));
		create_workers.startWorkers(Integer.parseInt(args[2]));
		
		result.writeSchedulesToScreen();
		
		result.writeSchedulesToFile();
		
	}

}
