/*
 * Author: Thayanne Luiza
 * Date: 11/08/2015
 * Student's class that contains methods of students
 */
package controleAcademico;
import java.util.*;

public class Student {
	private String name;
	private ArrayList<Subject> courses = new ArrayList<Subject>();
	
	
	
	public Student(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
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
			throw new Exception ("This student is already registered in the subject");
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
		return  getName();
	}
	
	
	
}
