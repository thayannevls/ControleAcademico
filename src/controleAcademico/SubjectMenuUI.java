/*
 * Author: Thayanne Luiza / Eddie 
 * Date: 11/08/2015
 */
package controleAcademico;
import java.util.*;
public class SubjectMenuUI {
	

	
	public static void initialize(School school){
		try{
			do{
			System.out.println("What do you want?");
			System.out.println(" 1 - Consult  2 - Add Subject  3 - Remove Subject 4 - Back To Menu ");
			
			}while(SubjectMenuUI.choice(school));
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	/*
	 * Choices of subject's menu
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
	
	
	
	

	
}
