/*
 * Author: Thayanne Luiza
 * Date: 11/08/2015
 */
package controleAcademico;
import java.util.*;
public class StudentMenuUI {
	
	
	/*
	 * initialize menu of student
	 */
	public static void initialize(School school){
		try{
			do{
			
			System.out.println("What do you want?");
			System.out.println(" 1 - Consult  2 - Add Student  3 - Remove Student 4 - Register Subject 5 - Back To Menu ");
			
			}while(StudentMenuUI.choice(school));
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	



	/*
	 * Choices of student's menu
	 */
	
	public static boolean choice(School school) throws Exception{
		try{
			
			Scanner sc = new Scanner(System.in);
			String op = sc.nextLine();
			
			switch(op){
				case "1" :
					System.out.println("What do you want? ");
					System.out.println("1 - Search a student 2 - List all students");
					choiceConsult(school);
					return true;
					
				case "2":
					System.out.println("Type a name: ");
					school.addStudent(new Student(sc.nextLine()));
					return true;
					
				case "3":
					System.out.println("Type the name of the student that you want to remove: ");
					school.removeStudent(new Student(sc.nextLine()));
					return true;
				case "4":
					registryUI(school);
					return true;
				default:
					MainUI.choice(school);
					return false;
					
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
			return false;
		}
	}
	/*
	 * Menu for consult
	 */
	public static void choiceConsult(School school) throws Exception{
		try{
			
			
			Scanner sc = new Scanner(System.in);
			String op = sc.nextLine();
			switch(op){
				case "1": 
					System.out.println("Type the name of student: ");
					school.searchStudent(new Student(sc.nextLine()));
					break;
				case "2":
					school.showStudents();
					break;
				default:
					break;
			}
		
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	/*
	 * Method  with registry student on subject
	 */
	
	public static void registryUI(School school){
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Type the name of the Student: ");
			Student student = new Student( sc.nextLine());
			int posStudent = school.findPos(student);
			System.out.println("Type the name of the Subject: ");
			Subject subject = new Subject( sc.nextLine() ) ;
			int posSubject = school.findPos(subject);
			if( (posStudent != -1) && (posSubject!= -1)){
				school.registry(school.getStudents(posStudent), school.getSubject(posSubject));
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
}
