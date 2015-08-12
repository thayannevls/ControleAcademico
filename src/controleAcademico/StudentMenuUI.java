package controleAcademico;
import java.util.*;
public class StudentMenuUI {
	

	
	
	public static boolean choice(School school) throws Exception{
		try{
			
			Scanner sc = new Scanner(System.in);
			String op = sc.nextLine();
			
			switch(op){
				case "1" :
					System.out.println("What do you want? ");
					System.out.println("1 - Search a studient 2 - List all studients");
					choiceConsult(school);
					return true;
					
				case "2":
					System.out.println("Type a name: ");
					school.addStudent(new Student(sc.nextLine()));
					return true;
					
				case "3":
					System.out.println("Type the name of the studient that you want to remove: ");
					school.removeStudent(new Student(sc.nextLine()));
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
	
	public static void choiceConsult(School school) throws Exception{
		try{
			
			Scanner sc = new Scanner(System.in);
			String op = sc.nextLine();
			switch(op){
				case "1": 
					break;
				case "2":
					school.showStudents();
					break;
				default:
					break;
			}
		
		}catch(Exception e){
		e.getMessage();
	}
	}
}
