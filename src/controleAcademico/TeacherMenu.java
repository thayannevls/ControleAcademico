/*
 * Author: Rebeca Galdino
 * Date: 12/08/2015
 * TeacherMenu Class from Controle Academico project - Redirection Menu - Organize and call the part of TeacherMenuUI picked
 */
package controleAcademico;
public class TeacherMenu {
	/**
	 * initialize menu of teacher
	 * 
	 * @param Object from type School, which is going to lead until this menu
	 */
	public static void initialize(School school){
		try{
			do{
			
			System.out.println("What do you want?");
			System.out.println(" 1 - Consult  2 - Add Teacher  3 - Remove Teacher 4 - Back To Menu ");
			
			}while(TeacherMenuUI.choice(school));
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
