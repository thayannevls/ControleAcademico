/*
 * Author: Rebeca Galdino
 * Date: 12/08/2015
 * TeacherMenuUI Class from Controle Academico project - Show the interactions with the user and call the methods chosen
 */
package controleAcademico;
import java.util.Scanner;

public class TeacherMenuUI {
	

	/*
	 * Choices of teacher's menu
	 */
	
	public static boolean choice(School school) throws Exception{
		try{
			
			Scanner sc = new Scanner(System.in);
			String op = sc.nextLine();
			
			switch(op){
				case "1" :
					System.out.println("What do you want? ");
					System.out.println("1 - Search a teacher 2 - List all teachers");
					choiceConsult(school);
					return true;
					
				case "2":
					System.out.println("Type a name: ");
					school.teacherRegistration(new Teacher(sc.nextLine()));
					return true;
					
				case "3":
					System.out.println("Type the name of the teacher that you want to remove: ");
					school.removeTeacher(new Teacher(sc.nextLine()));
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
					System.out.println("Type the name of the teacher: ");
					school.searchTeacher(new Teacher(sc.nextLine()));
					break;
				case "2":
					school.showTeachers();
					break;
				default:
					break;
			}
		
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	
	

}
