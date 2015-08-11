package controleAcademico;

import java.util.*;

public class School {
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Subject> subjects = new ArrayList<Subject>();
	private ArrayList<Teacher> teachers = new ArrayList<Teacher>();
	
	public School(){
		
	}
	
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
	

	
}
