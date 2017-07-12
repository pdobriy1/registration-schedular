package registerationSchedular.store;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import java.util.Iterator;
import registerationSchedular.util.Logger;

import registerationSchedular.scheduling.course_alloc_DS;
import registerationSchedular.scheduling.course_alloc_temp_DS;
public class Results implements StdoutDisplayInterface,FileDisplayInterface {

	private Vector<course_alloc_DS> course_list_result;
	private Vector<course_alloc_temp_DS> course_list ;

	public int preferenceValue_course1=0,preferenceValue_course2=0,preferenceValue_course3=0;
	public int preferenceValue_course4=0,preferenceValue_course5=0;
	public int TotalpreferenceValue_courses = 0;
	public int totalpreferenceValue_students = 0;
	public int averagePreferencescore;
	public String OUTPUTFILE;

	public Results(String outputfilename){
		OUTPUTFILE = outputfilename;
		course_list_result = new Vector<course_alloc_DS>();
		course_list = new Vector<course_alloc_temp_DS>();
		Logger.writeMessage("Constructor invoked: " + this.getClass().getName(), Logger.DebugLevel.CONSTRUCTOR);

	}
	public void viewcourselisttemp(Vector<course_alloc_temp_DS> courseListTemp){
		course_list = courseListTemp;
	}
	public void addobjectstoVector(int index,course_alloc_DS course_listOBJ){
		course_list_result.add(index, course_listOBJ);
//		String studentname;
//		studentname = course_listOBJ.getStudentName();
//		String numberOnly= studentname.replaceAll("[^0-9]", "_");
//		index = Integer.parseInt(numberOnly);
//		course_list_result.add(index, course_listOBJ);
	}
	@Override
	public void writeSchedulesToScreen() {
	
		try{
//			for(int x =0;x<course_list_result.size();x++){
//				for(int y=1;y<course_list_result.size();y++){
//					if(course_list_result.get(x).getStudentName().equals((course_list_result.get(y).getStudentName()))){
//						course_list_result.remove(y);
//					}
//				}
//			}
			
//			System.out.println(course_list_result.size());
			for(int i = 0;i < course_list.size();i++ ){
				System.out.println(course_list_result.get(i).getStudentName()+" "+course_list_result.get(i).getPreference_course1()+" "+course_list_result.get(i).getPreference_course2()+" "+course_list_result.get(i).getPreference_course3()+" "+course_list_result.get(i).getPreference_course4()+" "+course_list_result.get(i).getPreference_course5());
				
				/*
				 * for 1st preference course
				 */
				
				if(course_list_result.get(i).getPreference_course1().equals("A")){
					preferenceValue_course1 = course_list.get(i).getCourse_A();
				}else if(course_list_result.get(i).getPreference_course1().equals("B")){
					preferenceValue_course1 = course_list.get(i).getCourse_B();
				}else if(course_list_result.get(i).getPreference_course1().equals("C")){
					preferenceValue_course1 = course_list.get(i).getCourse_C();
				}else if(course_list_result.get(i).getPreference_course1().equals("D")){
					preferenceValue_course1 = course_list.get(i).getCourse_D();
				}else if(course_list_result.get(i).getPreference_course1().equals("E")){
					preferenceValue_course1 = course_list.get(i).getCourse_E();
				}else if(course_list_result.get(i).getPreference_course1().equals("F")){
					preferenceValue_course1 = course_list.get(i).getCourse_F();
				}else if(course_list_result.get(i).getPreference_course1().equals("G")){
					preferenceValue_course1 = course_list.get(i).getCourse_G();
				}
//				
//				/*
//				 * for 2nd preference course
//				 */
				if(course_list_result.get(i).getPreference_course2().equals("A")){
					preferenceValue_course2 = course_list.get(i).getCourse_A();
				}else if(course_list_result.get(i).getPreference_course2().equals("B")){
					preferenceValue_course2 = course_list.get(i).getCourse_B();
				}else if(course_list_result.get(i).getPreference_course2().equals("C")){
					preferenceValue_course2 = course_list.get(i).getCourse_C();
				}else if(course_list_result.get(i).getPreference_course2().equals("D")){
					preferenceValue_course2 = course_list.get(i).getCourse_D();
				}else if(course_list_result.get(i).getPreference_course2().equals("E")){
					preferenceValue_course2 = course_list.get(i).getCourse_E();
				}else if(course_list_result.get(i).getPreference_course2().equals("F")){
					preferenceValue_course2 = course_list.get(i).getCourse_F();
				}else if(course_list_result.get(i).getPreference_course2().equals("G")){
					preferenceValue_course2 = course_list.get(i).getCourse_G();
				}
				/*
				 * for 3rd preference course
				 */
				if(course_list_result.get(i).getPreference_course3().equals("A")){
					preferenceValue_course3 = course_list.get(i).getCourse_A();
				}else if(course_list_result.get(i).getPreference_course3().equals("B")){
					preferenceValue_course3 = course_list.get(i).getCourse_B();
				}else if(course_list_result.get(i).getPreference_course3().equals("C")){
					preferenceValue_course3 = course_list.get(i).getCourse_C();
				}else if(course_list_result.get(i).getPreference_course3().equals("D")){
					preferenceValue_course3 = course_list.get(i).getCourse_D();
				}else if(course_list_result.get(i).getPreference_course3().equals("E")){
					preferenceValue_course3 = course_list.get(i).getCourse_E();
				}else if(course_list_result.get(i).getPreference_course3().equals("F")){
					preferenceValue_course3 = course_list.get(i).getCourse_F();
				}else if(course_list_result.get(i).getPreference_course3().equals("G")){
					preferenceValue_course3 = course_list.get(i).getCourse_G();
				}
				
				/*
				 * for 4th preference course
				 */
				if(course_list_result.get(i).getPreference_course4().equals("A")){
					preferenceValue_course4 = course_list.get(i).getCourse_A();
				}else if(course_list_result.get(i).getPreference_course4().equals("B")){
					preferenceValue_course4 = course_list.get(i).getCourse_B();
				}else if(course_list_result.get(i).getPreference_course4().equals("C")){
					preferenceValue_course4 = course_list.get(i).getCourse_C();
				}else if(course_list_result.get(i).getPreference_course4().equals("D")){
					preferenceValue_course4 = course_list.get(i).getCourse_D();
				}else if(course_list_result.get(i).getPreference_course4().equals("E")){
					preferenceValue_course4 = course_list.get(i).getCourse_E();
				}else if(course_list_result.get(i).getPreference_course4().equals("F")){
					preferenceValue_course4 = course_list.get(i).getCourse_F();
				}else if(course_list_result.get(i).getPreference_course4().equals("G")){
					preferenceValue_course4 = course_list.get(i).getCourse_G();
				}
				/*
				 * for 5th preference course
				 */
				if(course_list_result.get(i).getPreference_course1().equals("A")){
					preferenceValue_course1 = course_list.get(i).getCourse_A();
				}else if(course_list_result.get(i).getPreference_course1().equals("B")){
					preferenceValue_course1 = course_list.get(i).getCourse_B();
				}else if(course_list_result.get(i).getPreference_course1().equals("C")){
					preferenceValue_course1 = course_list.get(i).getCourse_C();
				}else if(course_list_result.get(i).getPreference_course1().equals("D")){
					preferenceValue_course1 = course_list.get(i).getCourse_D();
				}else if(course_list_result.get(i).getPreference_course1().equals("E")){
					preferenceValue_course1 = course_list.get(i).getCourse_E();
				}else if(course_list_result.get(i).getPreference_course1().equals("F")){
					preferenceValue_course1 = course_list.get(i).getCourse_F();
				}else if(course_list_result.get(i).getPreference_course1().equals("G")){
					preferenceValue_course1 = course_list.get(i).getCourse_G();
				}
				TotalpreferenceValue_courses = preferenceValue_course1 + preferenceValue_course2 + preferenceValue_course3 + preferenceValue_course4 + preferenceValue_course5;
				totalpreferenceValue_students = totalpreferenceValue_students + TotalpreferenceValue_courses;
			}		
			averagePreferencescore = totalpreferenceValue_students / 80;
			System.out.println(averagePreferencescore);
			
		}
		catch(Exception e){
			System.out.println("exception caught"+e);
			e.printStackTrace();
		}finally{
			
		}
	}

	@Override
	public void writeSchedulesToFile() {
		
		try {
			File f = new File(OUTPUTFILE);
			FileWriter fw = null;
			fw = new FileWriter(f);
			
			BufferedWriter writer = new BufferedWriter(fw);
			int preferenceValue_1sub = 0 ,preferenceValue_2sub = 0,preferenceValue_3sub = 0,preferenceValue_4sub=0,preferenceValue_5sub = 0,totalpreference_Value ;
			int preference_Score_Students = 0;
			int numb_Students = course_list_result.size();
			
			for(int i = 0;i < course_list.size();i++ ){
				System.out.println(course_list_result.get(i).getStudentName()+" "+course_list_result.get(i).getPreference_course1()+" "+course_list_result.get(i).getPreference_course2()+" "+course_list_result.get(i).getPreference_course3()+" "+course_list_result.get(i).getPreference_course4()+" "+course_list_result.get(i).getPreference_course5());
				
				/*
				 * for 1st preference course
				 */
				
				if(course_list_result.get(i).getPreference_course1().equals("A")){
					preferenceValue_1sub = course_list.get(i).getCourse_A();
				}else if(course_list_result.get(i).getPreference_course1().equals("B")){
					preferenceValue_1sub = course_list.get(i).getCourse_B();
				}else if(course_list_result.get(i).getPreference_course1().equals("C")){
					preferenceValue_1sub = course_list.get(i).getCourse_C();
				}else if(course_list_result.get(i).getPreference_course1().equals("D")){
					preferenceValue_1sub = course_list.get(i).getCourse_D();
				}else if(course_list_result.get(i).getPreference_course1().equals("E")){
					preferenceValue_1sub = course_list.get(i).getCourse_E();
				}else if(course_list_result.get(i).getPreference_course1().equals("F")){
					preferenceValue_1sub = course_list.get(i).getCourse_F();
				}else if(course_list_result.get(i).getPreference_course1().equals("G")){
					preferenceValue_1sub = course_list.get(i).getCourse_G();
				}
//				
//				/*
//				 * for 2nd preference course
//				 */
				if(course_list_result.get(i).getPreference_course2().equals("A")){
					preferenceValue_2sub = course_list.get(i).getCourse_A();
				}else if(course_list_result.get(i).getPreference_course2().equals("B")){
					preferenceValue_2sub = course_list.get(i).getCourse_B();
				}else if(course_list_result.get(i).getPreference_course2().equals("C")){
					preferenceValue_2sub = course_list.get(i).getCourse_C();
				}else if(course_list_result.get(i).getPreference_course2().equals("D")){
					preferenceValue_2sub = course_list.get(i).getCourse_D();
				}else if(course_list_result.get(i).getPreference_course2().equals("E")){
					preferenceValue_2sub = course_list.get(i).getCourse_E();
				}else if(course_list_result.get(i).getPreference_course2().equals("F")){
					preferenceValue_2sub = course_list.get(i).getCourse_F();
				}else if(course_list_result.get(i).getPreference_course2().equals("G")){
					preferenceValue_2sub = course_list.get(i).getCourse_G();
				}
				/*
				 * for 3rd preference course
				 */
				if(course_list_result.get(i).getPreference_course3().equals("A")){
					preferenceValue_3sub = course_list.get(i).getCourse_A();
				}else if(course_list_result.get(i).getPreference_course3().equals("B")){
					preferenceValue_3sub = course_list.get(i).getCourse_B();
				}else if(course_list_result.get(i).getPreference_course3().equals("C")){
					preferenceValue_3sub = course_list.get(i).getCourse_C();
				}else if(course_list_result.get(i).getPreference_course3().equals("D")){
					preferenceValue_3sub = course_list.get(i).getCourse_D();
				}else if(course_list_result.get(i).getPreference_course3().equals("E")){
					preferenceValue_3sub = course_list.get(i).getCourse_E();
				}else if(course_list_result.get(i).getPreference_course3().equals("F")){
					preferenceValue_3sub = course_list.get(i).getCourse_F();
				}else if(course_list_result.get(i).getPreference_course3().equals("G")){
					preferenceValue_3sub = course_list.get(i).getCourse_G();
				}
				
				/*
				 * for 4th preference course
				 */
				if(course_list_result.get(i).getPreference_course4().equals("A")){
					preferenceValue_4sub = course_list.get(i).getCourse_A();
				}else if(course_list_result.get(i).getPreference_course4().equals("B")){
					preferenceValue_4sub = course_list.get(i).getCourse_B();
				}else if(course_list_result.get(i).getPreference_course4().equals("C")){
					preferenceValue_4sub = course_list.get(i).getCourse_C();
				}else if(course_list_result.get(i).getPreference_course4().equals("D")){
					preferenceValue_4sub = course_list.get(i).getCourse_D();
				}else if(course_list_result.get(i).getPreference_course4().equals("E")){
					preferenceValue_4sub = course_list.get(i).getCourse_E();
				}else if(course_list_result.get(i).getPreference_course4().equals("F")){
					preferenceValue_4sub = course_list.get(i).getCourse_F();
				}else if(course_list_result.get(i).getPreference_course4().equals("G")){
					preferenceValue_4sub = course_list.get(i).getCourse_G();
				}
				/*
				 * for 5th preference course
				 */
				if(course_list_result.get(i).getPreference_course1().equals("A")){
					preferenceValue_5sub = course_list.get(i).getCourse_A();
				}else if(course_list_result.get(i).getPreference_course1().equals("B")){
					preferenceValue_5sub = course_list.get(i).getCourse_B();
				}else if(course_list_result.get(i).getPreference_course1().equals("C")){
					preferenceValue_5sub = course_list.get(i).getCourse_C();
				}else if(course_list_result.get(i).getPreference_course1().equals("D")){
					preferenceValue_5sub = course_list.get(i).getCourse_D();
				}else if(course_list_result.get(i).getPreference_course1().equals("E")){
					preferenceValue_5sub = course_list.get(i).getCourse_E();
				}else if(course_list_result.get(i).getPreference_course1().equals("F")){
					preferenceValue_5sub = course_list.get(i).getCourse_F();
				}else if(course_list_result.get(i).getPreference_course1().equals("G")){
					preferenceValue_5sub = course_list.get(i).getCourse_G();
				}
				int TotalpreferenceValue_students =0;
				preference_Score_Students = preferenceValue_1sub + preferenceValue_2sub + preferenceValue_3sub + preferenceValue_4sub + preferenceValue_5sub;
				TotalpreferenceValue_students = TotalpreferenceValue_students + preference_Score_Students;
				
				write(writer,course_list_result.get(i).getStudentName()+" "+course_list_result.get(i).getPreference_course1()+" "+course_list_result.get(i).getPreference_course2()+" "+course_list_result.get(i).getPreference_course3()+" "+course_list_result.get(i).getPreference_course4()+" "+course_list_result.get(i).getPreference_course5()+"\n");
			}		
			float AvgPreferencescore = totalpreferenceValue_students / 80;
			write(writer,"Average preference score is : "+AvgPreferencescore);
			close_write(writer);
			
		}catch(FileNotFoundException fnf){
			System.out.println("File not found"+fnf);
			fnf.printStackTrace();
			System.exit(1);
		}
		catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		finally{
			
		}
		
	}
	
	private void write(BufferedWriter bw, String data) {
		try 
		{
			bw.write(data);
		} 
		catch (IOException e) 
		{
			System.out.println("Error while writing data to file: " + e.getMessage());
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	private void close_write(BufferedWriter bw)
	{
		try {
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



}
