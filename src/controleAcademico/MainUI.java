package controleAcademico;
import java.util.Scanner;
public class MainUI {
	
	public static void choice(School school){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME!");
		System.out.println("Selecet the session that you want to go: ");
		System.out.println("1 - Subjects 2 - Teachers 3 - Studients 4 - Exit");
		String op = sc.nextLine();
		switch(op){
			case "1" :
				break;
			case "2" :
				break;
			case "3" :
				StudentMenu.initialize(school);
				break;
			case "4":
				break;
		}
	}
	
	
}
