package registerationSchedular.util;
import java.util.ArrayList;

import registerationSchedular.scheduling.courses;
public class ObjectPool {
	private ArrayList<courses> course = new ArrayList<courses>();
	
	courses c = new courses();
	public synchronized courses Inititalize(courses C){
		C = new courses();
		return C;
		
	}
	/*
	 * borrow
	 */
	public synchronized void borrowObj(courses C,String courseName){
		if(courseName.equals("A")){
			C.BorrowcourseCountA();
		}else if(courseName.equals("B")){
			C.BorrowcourseCountB();
		}else if(courseName.equals("C")){
			C.BorrowcourseCountC();
		}
		else if(courseName.equals("D")){
			C.BorrowcourseCountD();
		}
		else if(courseName.equals("D")){
			C.BorrowcourseCountE();
		}else if(courseName.equals("E")){
			C.BorrowcourseCountE();
		}else if(courseName.equals("F")){
			C.BorrowcourseCountF();
		}else if(courseName.equals("G")){
			C.BorrowcourseCountG();
		}
	}
	/*
	 * releasea
	 */
	public synchronized void releaseobj(courses C,String courseName){
		if(courseName.equals("A")){
			C.ReleasecourseCountA();
		}else if(courseName.equals("B")){
			C.ReleasecourseCountB();
		}else if(courseName.equals("C")){
			C.ReleasecourseCountC();
		}
		else if(courseName.equals("D")){
			C.ReleasecourseCountD();
		}
		else if(courseName.equals("E")){
			C.ReleasecourseCountE();
		}else if(courseName.equals("F")){
			C.ReleasecourseCountF();
		}else if(courseName.equals("G")){
			C.ReleasecourseCountG();
		}
	}
	
	/*
	 * check availability
	 */
	public synchronized boolean checkAvailabilty(){
		if(c.getCourseCountA() > 0 || c.getCourseCountB() > 0 || c.getCourseCountC() > 0 || c.getCourseCountD() > 0 || c.getCourseCountE() > 0 || c.getCourseCountF() > 0 || c.getCourseCountG() > 0){
			return true;
		}
		else
			return false;
		
		
	}
	
	
	
}
