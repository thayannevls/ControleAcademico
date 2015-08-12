package controleAcademico;

public class StudentMenu {

	
	public static void initialize(School school){
		try{
			do{
			
			System.out.println("What do you want?");
			System.out.println(" 1 - Consult  2 - Add Studient  3 - Remove Studient 4 - Matriculation Studient 5 - Back To Menu ");
			
			}while(StudentMenuUI.choice(school));
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	

}
