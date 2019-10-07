import java.io.*;

public class StudentDataTest{
	public static void main(String [ ] args)throws FileNotFoundException {
		
		File file = new File("C:\\COP2800\\StudentGradesFile3.txt");
		try{
			if(!file.exists()){
				file.createNewFile();
			}		
		}
		catch(IOException e){
			
		}
		System.setOut(fileStream);
		StudentData studentData = new StudentData();
		studentData.readStudentData();
		studentData.readStudentGrades();
		studentData.bubbleSort();
		studentData.populateGrades();
		studentData.printData();
}
}