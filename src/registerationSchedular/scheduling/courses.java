package registerationSchedular.scheduling;

public class courses {

	private int courseCountA = 60,courseCountB = 60,courseCountC = 60,courseCountD = 60,courseCountE=60,courseCountF=60,courseCountG=60;

	public void BorrowcourseCountA(){
		courseCountA--;
	}
	
	public void BorrowcourseCountB(){
		courseCountB--;
		
	}
	public void BorrowcourseCountC(){
		courseCountC--;
		
	}
	public void BorrowcourseCountD(){
		courseCountD--;
	}
	public void BorrowcourseCountE(){
		courseCountE--;	
	}
	public void BorrowcourseCountF(){
		courseCountF--;
	}
	public void BorrowcourseCountG(){
		courseCountG--;
	}
	public void ReleasecourseCountA(){
		courseCountA++;
		
	}
	public void ReleasecourseCountB(){
		courseCountB++;
		
	}
	public void ReleasecourseCountC(){
		courseCountC++;
		
	}
	public void ReleasecourseCountD(){
		courseCountD++;
		
	}
	public void ReleasecourseCountE(){
		courseCountE++;
		
	}
	public void ReleasecourseCountF(){
		courseCountF++;
		
	}
	public void ReleasecourseCountG(){
		courseCountG++;
		
	}
	public int getCourseCountA() {
		return courseCountA;
	}

	public void setCourseCountA(int courseCountA) {
		this.courseCountA = courseCountA;
	}

	public int getCourseCountB() {
		return courseCountB;
	}

	public void setCourseCountB(int courseCountB) {
		this.courseCountB = courseCountB;
	}

	public int getCourseCountC() {
		return courseCountC;
	}

	public void setCourseCountC(int courseCountC) {
		this.courseCountC = courseCountC;
	}

	public int getCourseCountD() {
		return courseCountD;
	}

	public void setCourseCountD(int courseCountD) {
		this.courseCountD = courseCountD;
	}

	public int getCourseCountE() {
		return courseCountE;
	}

	public void setCourseCountE(int courseCountE) {
		this.courseCountE = courseCountE;
	}

	public int getCourseCountF() {
		return courseCountF;
	}

	public void setCourseCountF(int courseCountF) {
		this.courseCountF = courseCountF;
	}

	public int getCourseCountG() {
		return courseCountG;
	}

	public void setCourseCountG(int courseCountG) {
		this.courseCountG = courseCountG;
	}
	
	
}
