package registerationSchedular.scheduling;

import java.rmi.server.ObjID;
import java.util.Vector;
import registerationSchedular.util.ObjectPool;
import registerationSchedular.scheduling.courses;
import registerationSchedular.scheduling.course_alloc_temp_DS;
import registerationSchedular.store.Results;
import registerationSchedular.threadMgmt.WorkerThread;;

public class course_alloc {
	
	public static Vector<course_alloc_temp_DS> course_list = new Vector<course_alloc_temp_DS>();
	public static Vector<course_alloc_DS> course_list_result = new Vector<course_alloc_DS>();
	
//	public int Course_CapacityA = 60,Course_CapacityB = 60,Course_CapacityC = 60,Course_CapacityD = 60;
//	public int Course_CapacityE = 60,Course_CapacityF = 60,Course_CapacityG = 60;
	
//	public course_alloc(Vector<course_alloc_temp_DS> courseList) {
//		course_list = courseList;
//	}

	public synchronized void course_registeration(Vector<course_alloc_temp_DS> course_list,Results resultIn){
		int i;
		ObjectPool objpool = new ObjectPool();
		courses C = new courses();
		for( i = 0;i < course_list.size();i++){
			/*
			 * for Course A
			 */
//			if(Course_CapacityA > 0 || Course_CapacityB > 0 || Course_CapacityC > 0 || Course_CapacityD > 0 || Course_CapacityE > 0 || Course_CapacityF  > 0 || Course_CapacityG > 0){
				if(objpool.checkAvailabilty()){
				course_alloc_DS course_alloc_obj = new course_alloc_DS();
				course_alloc_obj.setStudentName(course_list.get(i).getStudent_name());
			
				if(course_list.get(i).getCourse_A() == 1){
					course_alloc_obj.setPreference_course1("A");
					objpool.borrowObj(C,"A");
//					Course_CapacityA--;
				}else if(course_list.get(i).getCourse_A() == 2){
					course_alloc_obj.setPreference_course2("A");
					objpool.borrowObj(C,"A");
				}else if(course_list.get(i).getCourse_A() == 3){
					course_alloc_obj.setPreference_course3("A");
					objpool.borrowObj(C,"A");
				}else if(course_list.get(i).getCourse_A() == 4){
					course_alloc_obj.setPreference_course4("A");
					objpool.borrowObj(C,"A");
				}else if(course_list.get(i).getCourse_A() == 5){
					course_alloc_obj.setPreference_course5("A");
					objpool.borrowObj(C,"A");
				}else if(course_list.get(i).getCourse_A() == 6){
					course_alloc_obj.setPreference_course6("A");
				}else if(course_list.get(i).getCourse_A() == 7){
					course_alloc_obj.setPreference_course7("A");
				}
				
				if(course_list.get(i).getCourse_B() == 1){
					course_alloc_obj.setPreference_course1("B");
					objpool.borrowObj(C,"B");
				}else if(course_list.get(i).getCourse_B() == 2){
					course_alloc_obj.setPreference_course2("B");
					objpool.borrowObj(C,"B");
				}else if(course_list.get(i).getCourse_B() == 3){
					course_alloc_obj.setPreference_course3("B");
					objpool.borrowObj(C,"B");
				}else if(course_list.get(i).getCourse_B() == 4){
					course_alloc_obj.setPreference_course4("B");
					objpool.borrowObj(C,"B");
				}else if(course_list.get(i).getCourse_B() == 5){
					course_alloc_obj.setPreference_course5("B");
					objpool.borrowObj(C,"B");
				}else if(course_list.get(i).getCourse_B() == 6){
					course_alloc_obj.setPreference_course6("B");
				}else if(course_list.get(i).getCourse_B() == 7){
					course_alloc_obj.setPreference_course7("B");
				}
				
				if(course_list.get(i).getCourse_C() == 1){
					course_alloc_obj.setPreference_course1("C");
					objpool.borrowObj(C,"C");
				}else if(course_list.get(i).getCourse_C() == 2){
					course_alloc_obj.setPreference_course2("C");
					objpool.borrowObj(C,"C");
				}else if(course_list.get(i).getCourse_C() == 3){
					course_alloc_obj.setPreference_course3("C");
					objpool.borrowObj(C,"C");
				}else if(course_list.get(i).getCourse_C() == 4){
					course_alloc_obj.setPreference_course4("C");
					objpool.borrowObj(C,"C");
				}else if(course_list.get(i).getCourse_C() == 5){
					course_alloc_obj.setPreference_course5("C");
					objpool.borrowObj(C,"C");
				}else if(course_list.get(i).getCourse_C() == 6){
					course_alloc_obj.setPreference_course6("C");
				}else if(course_list.get(i).getCourse_C() == 7){
					course_alloc_obj.setPreference_course7("C");
				}
				
				if(course_list.get(i).getCourse_D() == 1){
					course_alloc_obj.setPreference_course1("D");
					objpool.borrowObj(C,"D");
				}else if(course_list.get(i).getCourse_D() == 2){
					course_alloc_obj.setPreference_course2("D");
					objpool.borrowObj(C,"D");
				}else if(course_list.get(i).getCourse_D() == 3){
					course_alloc_obj.setPreference_course3("D");
					objpool.borrowObj(C,"D");
				}else if(course_list.get(i).getCourse_D() == 4){
					course_alloc_obj.setPreference_course4("D");
					objpool.borrowObj(C,"D");
				}else if(course_list.get(i).getCourse_D() == 5){
					course_alloc_obj.setPreference_course5("D");
					objpool.borrowObj(C,"D");
				}else if(course_list.get(i).getCourse_D() == 6){
					course_alloc_obj.setPreference_course6("D");
				}else if(course_list.get(i).getCourse_D() == 7){
					course_alloc_obj.setPreference_course7("D");
				}
				
				if(course_list.get(i).getCourse_E() == 1){
					course_alloc_obj.setPreference_course1("E");
					objpool.borrowObj(C,"E");
				}else if(course_list.get(i).getCourse_E() == 2){
					course_alloc_obj.setPreference_course2("E");
					objpool.borrowObj(C,"E");
				}else if(course_list.get(i).getCourse_E() == 3){
					course_alloc_obj.setPreference_course3("E");
					objpool.borrowObj(C,"E");
				}else if(course_list.get(i).getCourse_E() == 4){
					course_alloc_obj.setPreference_course4("E");
					objpool.borrowObj(C,"E");
				}else if(course_list.get(i).getCourse_E() == 5){
					course_alloc_obj.setPreference_course5("E");
					objpool.borrowObj(C,"E");
				}else if(course_list.get(i).getCourse_E() == 6){
					course_alloc_obj.setPreference_course6("E");
				}else if(course_list.get(i).getCourse_E() == 7){
					course_alloc_obj.setPreference_course7("E");
				}
				
				if(course_list.get(i).getCourse_F() == 1){
					course_alloc_obj.setPreference_course1("F");
					objpool.borrowObj(C,"F");
				}else if(course_list.get(i).getCourse_F() == 2){
					course_alloc_obj.setPreference_course2("F");
					objpool.borrowObj(C,"F");
				}else if(course_list.get(i).getCourse_F() == 3){
					course_alloc_obj.setPreference_course3("F");
					objpool.borrowObj(C,"F");
				}else if(course_list.get(i).getCourse_F() == 4){
					course_alloc_obj.setPreference_course4("F");
					objpool.borrowObj(C,"F");
				}else if(course_list.get(i).getCourse_F() == 5){
					course_alloc_obj.setPreference_course5("F");
					objpool.borrowObj(C,"F");
				}else if(course_list.get(i).getCourse_F() == 6){
					course_alloc_obj.setPreference_course6("F");
				}else if(course_list.get(i).getCourse_F() == 7){
					course_alloc_obj.setPreference_course7("F");
				}
				
				if(course_list.get(i).getCourse_G() == 1){
					course_alloc_obj.setPreference_course1("G");
					objpool.borrowObj(C,"G");
				}else if(course_list.get(i).getCourse_G() == 2){
					course_alloc_obj.setPreference_course2("G");
					objpool.borrowObj(C,"G");
				}else if(course_list.get(i).getCourse_G() == 3){
					course_alloc_obj.setPreference_course3("G");
					objpool.borrowObj(C,"G");
				}else if(course_list.get(i).getCourse_G() == 4){
					course_alloc_obj.setPreference_course4("G");
					objpool.borrowObj(C,"G");
				}else if(course_list.get(i).getCourse_G() == 5){
					course_alloc_obj.setPreference_course5("G");
					objpool.borrowObj(C,"G");
				}else if(course_list.get(i).getCourse_G() == 6){
					course_alloc_obj.setPreference_course6("G");
				}else if(course_list.get(i).getCourse_G() == 7){
					course_alloc_obj.setPreference_course7("G");
				}
				
			resultIn.addobjectstoVector(i,course_alloc_obj);
//			System.out.println(i);
			}	
		}
		resultIn.viewcourselisttemp(course_list);

	}
}
