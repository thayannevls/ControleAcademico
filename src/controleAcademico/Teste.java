package controleAcademico;
import java.util.*;
public class Teste {
	public static void main(String [] args){
		try {
			Scanner sc = new Scanner(System.in);
			Subject matematica = new Subject("matematica");
			Student estudante = new Student("robinho");
			School school = new School();
			school.addStudent(estudante);
		
			school.subjectRegistration(matematica);
			school.registry(estudante, matematica);
			school.searchStudent(new Student(sc.nextLine()));

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
