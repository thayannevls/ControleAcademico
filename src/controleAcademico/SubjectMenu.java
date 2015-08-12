package controleAcademico;

public class SubjectMenu {
	/*
	 * initialize menu of student
	 */
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
	

}
