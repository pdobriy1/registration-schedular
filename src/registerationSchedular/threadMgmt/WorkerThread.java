package registerationSchedular.threadMgmt;

import java.util.Vector;

import registerationSchedular.util.Logger;

import registerationSchedular.scheduling.course_alloc;
import registerationSchedular.scheduling.course_alloc_DS;
import registerationSchedular.scheduling.course_alloc_temp_DS;
import registerationSchedular.store.Results;
import registerationSchedular.util.FileProcessor;

public class WorkerThread implements Runnable{

	private FileProcessor fp;
	private Results results;
	private String lineFromFile;
	public static Vector<course_alloc_temp_DS> course_list = new Vector<course_alloc_temp_DS>();
	public static Vector<course_alloc_DS> course_list_result = new Vector<course_alloc_DS>();
	public int Course_CapacityA = 60,Course_CapacityB = 60,Course_CapacityC = 60,Course_CapacityD = 60;
	public int Course_CapacityE = 60,Course_CapacityF = 60,Course_CapacityG = 60;
	private course_alloc CourseAllocObj;
	
	public WorkerThread(FileProcessor fpln, Results resultsln,course_alloc course_alloc_objIn) {
		fp = fpln;
		results = resultsln;
		CourseAllocObj = course_alloc_objIn;
		Logger.writeMessage("Constructor invoked: " + this.getClass().getName(), Logger.DebugLevel.CONSTRUCTOR);

	}
	
	@Override
	 public void run() {
		while((lineFromFile = fp.readLineFromFile()) != null){
			Logger.writeMessage("Run method invoked." + Thread.currentThread().getName(), Logger.DebugLevel.THREAD);

			//object is created for the course_alloc_temp_DS
			course_alloc_temp_DS course_alloc_obj = new course_alloc_temp_DS();
			String[] student_dtls = lineFromFile.split(" ");

			for(int i = 0 ;i < student_dtls.length;i++){
				switch(i){
				case 0 :
					course_alloc_obj.setStudent_name(student_dtls[0]);
					break;
				case 1 :
					course_alloc_obj.setCourse_A(Integer.parseInt(student_dtls[1]));
					break;
				case 2 :
					course_alloc_obj.setCourse_B(Integer.parseInt(student_dtls[2]));
					break;
				case 3 :
					course_alloc_obj.setCourse_C(Integer.parseInt(student_dtls[3]));
					break;
				case 4 :
					course_alloc_obj.setCourse_D(Integer.parseInt(student_dtls[4]));
					break;
				case 5 :
					course_alloc_obj.setCourse_E(Integer.parseInt(student_dtls[5]));
					break;
				case 6 :
					course_alloc_obj.setCourse_F(Integer.parseInt(student_dtls[6]));
					break;
				case 7 :
					course_alloc_obj.setCourse_G(Integer.parseInt(student_dtls[7]));
					break;
				default :
					break;
				}
			}
			course_list.add(course_alloc_obj);
			
//			System.out.println(course_alloc_obj.getStudent_name()+" "+course_alloc_obj.getCourse_A()+" "+course_alloc_obj.getCourse_B()+" "+course_alloc_obj.getCourse_C()+" "+course_alloc_obj.getCourse_D()+" "+course_alloc_obj.getCourse_E()+" "+course_alloc_obj.getCourse_F()+" "+course_alloc_obj.getCourse_G());
		}
//		System.out.println(course_list.size());
		CourseAllocObj.course_registeration(course_list,results);

		
		
		
	}

}
