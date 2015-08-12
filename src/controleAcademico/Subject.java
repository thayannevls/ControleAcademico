/**
 * 
 */
package controleAcademico;
import java.util.*;
public class Subject {
		
		private String name;
		
		
		public Subject(String name) {
			this.name = name;
		}


		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		

		public boolean equals(Subject subject){
			if(this.name.equals(subject.name))
				return true;
			return false;
		}
		
	
		public String toString() {
			return  getName();
		}
		
}