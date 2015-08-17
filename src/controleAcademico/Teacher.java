/**
 * @author Rebeca Galdino
 * @date 09/08/2015
 * Teacher Class from Controle Academico project - Hold the teacher's attributes, the method to verify the names and the toString Method
 */
package controleAcademico;


public class Teacher extends Person {
	
	public Teacher(String name, String cpf, String birthDate, String gender) {
		super(name,cpf,birthDate,gender);
	}
	
	public Teacher(String name){
		super(name);
	}

	/**
	 * toString method
	 */
	public String toString(){
		return getName();
	}

	
    /**
     * Equals Method - verify the field name
     * @see java.lang.Object#equals(java.lang.Object)
     */

	public boolean equals(Teacher teacher){
		if(this.getName().equals(teacher.getName())){
			return true;
		}
		return false;
	}


	
}
