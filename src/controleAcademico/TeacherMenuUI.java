/**
 * @author Rebeca Galdino and Thayanne Luiza
 * @date 12/08/2015
 * TeacherMenuUI Class from Controle Academico project - Show the interactions with the user and call the methods chosen
 */
package controleAcademico;
import java.util.Scanner;

public class TeacherMenuUI {
	
	/**
	 * initialize menu of teacher
	 * 
	 * @param Object from type School, which is going to lead until this menu
	 */
	public static void initialize(School school){
		try{
			do{
			
			System.out.println("What do you want?");
			System.out.println(" 1 - Consult  2 - Add Teacher  3 - Remove Teacher 4 - Register Teacher's Subject 5 - Back To Menu ");
			
			}while(TeacherMenuUI.choice(school));
		} catch(Exception e){
			System.err.println(e.getMessage());
		}
	}

	/**
	 * Choices of teacher's menu
	 * 
	 * @param Object from type school
	 * @return true if an option that will lead to an activity is taken. If it's not, return false and lead to the main menu
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
					school.teacherRegistration();
					return true;
					
				case "3":
					System.out.println("Type the name of the teacher that you want to remove: ");
					school.removeTeacher(new Teacher(sc.nextLine()));
					return true;
				case "4":
					registryUI(school);
					return true;
				default:
					Main.choice(school);
					return false;
					
			}
		}catch(Exception e){
			System.err.println(e.getMessage());
			return true;
		}
	}
	
	/**
	 * Menu for consult
	 * 
	 * @return the call to the method that is chosen
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
			System.err.println(e.getMessage());
		}
	}
	
	/*
	 * Method  with registry subject on teacher's own list
	 */
	
	public static void registryUI(School school){
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Type the teacher's name: ");
			Teacher teacher = new Teacher( sc.nextLine());
			int posT = school.findPos(teacher);
			System.out.println("Type the name of the Subject: ");
			Subject subject = new Subject( sc.nextLine() ) ;
			int posSubject = school.findPos(subject);
			if( (posT != -1) && (posSubject != -1)){
				school.registry(school.getTeachers(posT), school.getSubject(posSubject));
			}
		} catch (Exception e) {
			
			System.err.println(e.getMessage());
		}
		
	}
	

}
