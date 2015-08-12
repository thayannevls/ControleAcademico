/*
 * Author: Rebeca Galdino
 * Date: 09/08/2015
 * Teacher Class from Controle Academico project - Hold the teacher's attributes, the method to verify the names and the toString Method
 */
package controleAcademico;


public class Teacher {
	private String name;
	/*
	 * Teacher's Class constructors 
	 * 
	 * @param name - New teacher's name
	 */
	public Teacher(String name){
		this.name = name;
	}
	
	public Teacher(){
		
	}
	
	/*
	 * Get and set 
	 */
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	/*
	 * toString
	 */
	public String toString(){
		return getName() + "\n";
	}

	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	
}
