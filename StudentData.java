import java.util.*;
import java.io.*;



public class StudentData{
String [ ] studentNumbers = new String [ 102 ] ;
double [ ] studentGrades = new double [102];
String [ ] studentLetter = new String [102];
	public void  readStudentData(){
	 

		try {
			
			Scanner s1 = new Scanner(new File("project_in.txt"));
			for(int i = 1; i < studentNumbers.length; i++){
				studentNumbers [i] = s1.next();
				s1.nextLine();
				}
			studentNumbers[0] = "0";
			studentNumbers[1] = "0";
			}
		
  
		catch(NoSuchElementException | IOException e) {
  
		}
		
	}
 
	
	

	public void readStudentGrades(){
 
		
		try{
  
			float a;
			Scanner s2 = new Scanner(new File("project_in.txt"));
			for(int i = 0; i<102 ;i++){
				if((s2.hasNextFloat()) && (s2.nextFloat() % 1 == 0)){
					studentGrades[i] = s2.nextFloat();
				}
				
				else {
					s2.next();
				}
			}
		} 
 
		catch(NoSuchElementException | IOException  e){
  
		}
 
		
 
 
	}
		

		

	
	
		public void bubbleSort() {

			int n = studentGrades.length;
			double grade = 0.0;
			String temp = " ";
				for (int i = 0; i < n; i++) {
					for (int j = 1; j < (n - i); j++) {

						if (studentGrades[j - 1] < studentGrades[j]) {
							grade = studentGrades[j - 1];
							studentGrades[j - 1] = studentGrades[j];
							studentGrades[j] = grade;
							temp = studentNumbers[j-1];
							studentNumbers[j-1]= studentNumbers[j];
							studentNumbers[j] = temp;
						}

					}
				}
		}
		
		public void populateGrades(){
			for(int i = 0; i < studentGrades.length; i++){
				if(studentGrades[i]<=100 && studentGrades[i] >= 90 ){
					studentLetter[i] = "A";
				}
				else if(studentGrades[i]<90 && studentGrades[i] >= 80){
					studentLetter[i] = "B";
				}
				else if (studentGrades[i]<80 && studentGrades[i]>=70){
					studentLetter[i] = "C";
				}
				else if (studentGrades[i]<70 && studentGrades[i]>=60){
					studentLetter[i] = "D";
				}
				else if (studentGrades[i]<60 && studentGrades[i]>=0){
					studentLetter[i] = "F";
				}
			}
		} 
		public void printData() {
			System.out.println("ID                 Average         Letter Grade");
			for(int i=0; i<100; i++)
				System.out.printf("%s                %f             %s\n",studentNumbers[i],studentGrades[i],studentLetter[i]);
		}
		
		
		
}
		
		

	

