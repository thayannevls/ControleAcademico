/*
 * 
 * Date: 11/08/2015
 * 
 * Here is the main of all the program
 */
package controleAcademico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		School school = new School();
		choice(school);

		
		

	}
	
	public static void choice(School school){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME!");
		System.out.println("Selecet the session that you want to go: ");
		System.out.println("1 - Subjects 2 - Teachers 3 - Students 4 - Exit");
		String op = sc.nextLine();
		switch(op){
			case "1" :
				SubjectMenuUI.initialize(school);
				break;
			case "2" :
				TeacherMenuUI.initialize(school);
				break;
			case "3" :
				StudentMenuUI.initialize(school);
				break;
			case "4":
				break;
		}
	}

}
