/*
 * Author: Thayanne Luiza
 * Date: 11/08/2015
 */
package controleAcademico;
import java.util.*;
public class SubjectMenuUI {
	

	/*
	 * Choices of student's menu
	 */
	
	public static boolean choice(School school) throws Exception{
		try{
			
			Scanner sc = new Scanner(System.in);
			String op = sc.nextLine();
			
			switch(op){
				case "1" :
					System.out.println("List of all subjects");
					school.showSubjects();
					return true;
					
				case "2":
					System.out.println("Type a name: ");
					school.subjectRegistration(new Subject(sc.nextLine()));
					return true;
					
				case "3":
					System.out.println("Type the name of the subject that you want to remove: ");
					school.removeSubject(new Subject(sc.nextLine()));
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
	
	public static void matriculation(School school){
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Type the name of the Student: ");
			Student student = new Student( sc.nextLine());
			System.out.println("Type the name of the Subject: ");
			Subject subject = new Subject( sc.nextLine() ) ;
			school.matriculation(student, subject);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
}
