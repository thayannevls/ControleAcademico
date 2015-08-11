/*
 * Authors: Thayanne, Rebeca and Eddie
 * Date: 11/08/2015
 * 
 * Class that unites all the students, subjects and teachers; and have the methods to manipulate it.
 */
package controleAcademico;

import java.util.*;

public class School {
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Teacher> teachers = new ArrayList<Teacher>();
	private ArrayList<Subject> subjects = new ArrayList<Subject>();
	
	public School(){
		
	}
	
	/*                               STUDENT'S METHODS                          */
	
	public  void showStudents(){
		for(int p = 0; p < students.size(); p++)
			System.out.println(students.get(p));
	}
	
	/*
	 * Method that add a student into a list os students
	 */
	public boolean addStudent(Student student){
		if(find(student))
			return false;
		else
			students.add(student);
		return true;
	}
	
	/*
	 * Method that remove a student into a list os students
	 */
	public boolean removeStudent(Student student){
		int pos = findPos(student);
		if(pos == -1)
			return false;
		else
			students.remove(pos);
		return true;
			
	}
	
	/*
	 * Method that find the student on list of students and if was possible find it, return true
	 * if not, return false
	 */
	public  boolean find(Student student){
		for(int p = 0; p < students.size(); p++){
			if(student.equals(students.get(p)))
				return true;
		
		}
		return false;
	}
	
	/*
	 * Method that find the position of  the student on list of students and if was possible find it, return the position
	 * if not, return -1
	 */
	
	public int findPos(Student student){
		for(int p = 0; p < students.size(); p++){
			if(student == students.get(p))
				return p;
		}
		
		return -1;
	}
	
	/*                               TEACHER'S METHODS                                 */
	
	/*
	 * Teachers' list
	 */
	public void showTeachers() throws Exception{
			if (!teachers.isEmpty())
		    	for (int i=0; i < teachers.size(); i++){
		    		System.out.println(teachers.get(i) + "\n");
		    	}
		    else
		    	throw new Exception ("There are no teachers registereds.");
    }
	/*
	 * Teacher's register method, adding his name into a list of teachers
	 */
	public void teacherRegistration(Teacher t1) throws Exception{
		if(!find(t1))
			teachers.add(t1);
		else
			throw new Exception("Teacher is already registered!"); 
	}
	
	/*
	 * Find Method - returns boolean - if the teacher is found, return true; 
	 * if it's not, return false
	 *  
	 */
	public boolean find(Teacher t1){
		for(int p = 0; p < teachers.size(); p++){
			if(teachers.equals(teachers.get(p)))
				return true;
		
		}
		return false;
	}
	/*
	 * Find Method - returns int - if it's found, return the position
	 * if it's not, returns -1 
	 */
	public int findPos(Teacher t1){
		for (int i=0; i < teachers.size(); i++){
			if(t1.equals(teachers.get(i))){	
				return i;
			}
		}
		return -1;
	}
	/*
	 * Remove Method - Delete a register by the indication of the teacher's name
	 */
	public void removeTeacher(Teacher t1) throws Exception{
		if (findPos(t1) != -1)	
			teachers.remove(findPos(t1));
		else
			throw new Exception("Teacher not found!");
	}
	
	
	


	
/*                               SUBJECT'S METHODS                                 */

	
}