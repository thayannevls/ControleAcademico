/**
 * @author Rebeca Galdino
 * @date 09/08/2015
 * Teacher Class from Controle Academico project - Hold the teacher's attributes, the method to verify the names and the toString Method
 */
package controleAcademico;

import java.util.ArrayList;


public class Teacher extends Person {
	
	private ArrayList<Subject> courses = new ArrayList<Subject>();
	
	public Teacher(String name, String cpf, String birthDate, String gender) {
		super(name,cpf,birthDate,gender);
	}
	
	public Teacher(String name){
		super(name);
	}
	public Subject getCourses(int index) {
		return courses.get(index);
	}
	
	public void showCourses(){
		for(int p = 1; p < courses.size() ; p++){
			Subject course = getCourses(p - 1);
			System.out.println("Subject " + p + " : " + course);
		}
	}
	
	public int getSize(){
		return courses.size();
	}
	
	/*
	 * Method that add a new subject in courses of the Student
	 *  if the subject it's not already registered in the courses will be added.
	 */
	public void setCourses(Subject subject) throws Exception{
		boolean exist = false;
		for(int p = 0; p < courses.size(); p++){
			Subject aux = courses.get(p);
			if(aux.equals(subject))
				exist = true;
		}
		if(!exist)
			courses.add(subject);
		else
			throw new Exception ("This teacher is already registered in the subject");
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
