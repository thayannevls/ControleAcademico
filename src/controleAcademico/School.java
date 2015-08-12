/*Authors: Thayanne, Rebeca and Eddie
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
			System.out.println("Name: " + students.get(p));
	}
	
	/*
	 * Method that add a student into a list os students
	 */
	public void addStudent(Student student)throws Exception{
		if(find(student))
			throw new Exception("This Studient already exists.");
		else
			students.add(student);
		
	}
	
	/*
	 * Method that remove a student into a list os students
	 */
	public void removeStudent(Student student) throws Exception{
		int pos = findPos(student);
		if(pos == -1)
			throw new Exception("This studient don't exists.");
		else
			students.remove(pos);
		
			
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
			if(student.equals(students.get(p)))
				return p;
		}
		
		return -1;
	}
	
	/*
	 * Method that registry a subject on student's roll
	 */
	
	public void matriculation(Student student , Subject subject) throws Exception{
		boolean exists = find(subject);
		if(exists)
			student.setRoll(subject);
		else
			throw new Exception("This subject doesn't exist.");
	}
	/*
	 * Method witch search student on array
	 */
	public void searchStudent(Student student) throws Exception{
		int pos = findPos(student);
		if(pos != -1){
			System.out.println(student);
			System.out.println("The roll's" + (students.get(pos)) + ": ");
			(students.get(pos)).showRoll();		
			
		}
		else
			throw new Exception("This Student doesn't exist.");
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

	
	public  void showSubjects(){
		for(int p = 0; p < subjects.size(); p++)
			System.out.println(subjects.get(p));
	}
	
	public void subjectRegistration(Subject subject)throws Exception{
		if(find(subject))
			throw new Exception("This subject already exists.");
		else
			subjects.add(subject);	
	}
	
	public void removeSubject(Subject subject) throws Exception{
		int pos = findPos(subject);
		if(pos == -1)
			throw new Exception("This subject don't exists.");
		else
			subjects.remove(pos);		
	}
	
	public  boolean find(Subject subject){
		for(int p = 0; p < subjects.size(); p++){
			if(subject.equals(subjects.get(p)))
				return true;
		
		}
		return false;
	}
	
	public int findPos(Subject subject){
		for(int p = 0; p < subjects.size(); p++){
			if(subject == subjects.get(p))
				return p;
		}
		
		return -1;
	}
	
}