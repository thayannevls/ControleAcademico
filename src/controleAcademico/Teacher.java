/**
 * @author Rebeca Galdino
 * @date 09/08/2015
 * Teacher Class from Controle Academico project - Hold the teacher's attributes, the method to verify the names and the toString Method
 */
package controleAcademico;


public class Teacher {
	private String name;
	/**
	 * Teacher's Class constructors 
	 * 
	 * @param name - New teacher's name
	 */
	public Teacher(String name){
		this.name = name;
	}
	
	
	/**
	 * GetName Method
	 * 
	 * @return The teacher's name
	 */
	public String getName() {
		return name;
	}

   /**
    * SetName Method
    * @param name which is inserted by the user 
    */

	public void setName(String name) {
		this.name = name;
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
		if(this.name.equals(teacher.name)){
			return true;
		}
		return false;
	}


	
}
