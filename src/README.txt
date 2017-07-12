 README FILE

Author: Prateek Dobriyal

PURPOSE:
The purpose of this assignment is to register courses based on the students priority using multithreading and object pool.

The data structure used in this project is vector.The reason for using vector is as it is thread safe and can increase or decrease size as needed.it can increase the size by doubling as compared to to arraylist which can grow by 50%.

Percent Complete:

Bugs:No bugs

Files:
	1.Driver.java
	2.course_alloc.java
	3.course_alloc_DS.java
	4.course_alloc_temp_DS.java
	5.courses.java
	6.Results.java
	7.FileDisplayInterface.interface
	8.StdoutDisplayInterface.interface
	9.CreateWorkers.java
	10.WorkerThread.java
	11.FileProcessor.java
	12.Logger.java
	13.ObjectPool.java

Sample output:
	Student_57 A B C D E
	Student_56 G A B C D
	Student_58 B C D E F
	Student_60 D E F G A
	Student_59 C D E F G
	Student_61 E F G A B
	Student_63 G A B C D
	Student_62 F G A B C
	Student_64 A B C D E
	Student_66 C D E F G
	Student_65 B C D E F
	Student_67 D E F G A
	Student_69 F G A B C
	Student_68 E F G A B
	Student_70 G A B C D
	Student_72 B C D E F
	Student_71 A B C D E
	Student_73 C D E F G
	Student_75 E F G A B
	Average preference score is : 13.0

To compile:	
	javac *.java

To run:
	java Driver input.txt output.txt




 
