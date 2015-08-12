/*
 * Author: Thayanne Luiza
 * Date: 11/08/2015
 */
package controleAcademico;
import java.util.*;

public class Student {
	private String name;
	private ArrayList<Subject> roll = new ArrayList();
	
	
	
	public Student(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Subject getRoll(int index) {
		return roll.get(index);
	}
	
	
	/*
	 * Method that add a new subject in roll of the Student
	 *  if the subject it's not already registrat in the roll will be added.
	 */
	public void setRoll(Subject subject) {
		boolean exist = false;
		for(int p = 0; p < roll.size(); p++){
			Subject aux = roll.get(p);
			if(aux.equals(subject))
				exist = true;
		}
		if(exist)
			roll.add(subject);
		
	}
	
	/*
	 * Equals that just compare the names of the students
	 */

	public boolean equals(Student student){
		if(this.name.equals( student.name)){
			return true;
		}
		return false;
	}

	public String toString(){
		return "Name: " + getName();
	}
	
}
