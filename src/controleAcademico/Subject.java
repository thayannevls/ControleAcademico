package controleAcademico;
import java.util.*;
public class Subject {
		private ArrayList <String> name = new ArrayList();
		public Subject(){
			ArrayList <String> name = new ArrayList<String>();
			this.name = name;
		}
		
		public void subjectRegistration(){
			Scanner s = new Scanner(System.in);
			System.out.println("<<< Register a new subject >>>");
			System.out.println("Type the subject's name: ");
			name.add(s.nextLine());
		}
		
		public void removeSubject(){
			ArrayList <String> name = new ArrayList<String>();
			Scanner s = new Scanner(System.in);
			System.out.println("<<< Remove a subject that already exists> >>");
			System.out.println("Type the subject's name to remove: ");
			this.name.remove(s.nextLine());	
		}

		public ArrayList<String> getName() {
			return name;
		}

	
		public void setName(ArrayList<String> name) {
			this.name = name;
		}

		
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (!(obj instanceof Subject))
				return false;
			Subject other = (Subject) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

		public String toString() {
			System.out.println("---");
			return "Subject's name --> " + name;
		}
		
		

}