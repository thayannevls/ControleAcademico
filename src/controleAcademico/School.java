/**
 * @authors Thayanne, Rebeca and Eddie
 * @date 11/08/2015
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
	
	public Student getStudents(int index){
		return students.get(index);
	}
	
	public  void showStudents(){
		for(int p = 0; p < students.size(); p++)
			System.out.println("Name: " + students.get(p));
	}
	
	/*
	 * Method that add a student into a list os students
	 */
	public void addStudent(Student student)throws Exception{
		if(find(student))
			throw new Exception("This Student already exists.");
		else
			students.add(student);
		
	}
	
	/*
	 * Method that remove a student into a list os students
	 */
	public void removeStudent(Student student) throws Exception{
		int pos = findPos(student);
		if(pos == -1)
			throw new Exception("This student don't exists.");
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
	 * Method that registry a subject on student's courses
	 */
	
	public void registry(Student student , Subject subject) throws Exception{
		boolean  existsStudent = find(student);
		boolean existsSubject = find(subject);
		if( (existsSubject) && (existsStudent))
			student.setCourses(subject);
		else
			throw new Exception("This subject or student doesn't exist.");
	}
	/*
	 * Method witch search student on array
	 */
	public void searchStudent(Student student) throws Exception{
		int pos = findPos(student);
		if(pos != -1){
			System.out.println(student);
			System.out.println("Courses:  ");
			for(int p = 0; p < students.get(pos).getSize(); p++)
				System.out.println("        " + students.get(pos).getCourses(p));
	
		}
		else
			throw new Exception("This Student doesn't exist.");
	}
	
	
	/*                               TEACHER'S METHODS                                 */
	
	public Teacher getTeachers(int index){
		return teachers.get(index);
	}
	
	/**
	 * Print the teachers' list
	 * 
	 * @throws Message if there are no teachers yet.
	 */
	public void showTeachers() throws Exception{
			if (!teachers.isEmpty())
		    	for (int i=0; i < teachers.size(); i++){
		    		System.out.println(teachers.get(i) + "\n");
		    	}
		    else
		    	throw new Exception ("There are no teachers registereds.");
    }
	
	/**
	 * Teacher's register method, adding his name into a list of teachers
	 * 
	 * @param Object from type teacher, holding a name and his informations
	 * @throws Exception if the teacher is already on the list.
	 */
	public void teacherRegistration() throws Exception{
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		Teacher t1 = new Teacher(name);
		if(findPos(t1) != -1)
			throw new Exception("Teacher is already registered!");
		else {
			System.out.println("Type the teacher's cpf: ");
			String cpf = s.nextLine();
			System.out.println("Type the teacher's birth date: ");
			String bd = s.nextLine();
			System.out.println("Type the teacher's gender: ");
			String gender = s.nextLine();
			teachers.add(new Teacher(name,cpf,bd,gender));
		}
		    
	}
	
	/**
	 * Find Method 
	 *
	 * @param Object from type teacher
	 * @return boolean - if the teacher is found, return true, if it's not, return false  
	 */
	public boolean find(Teacher t1){
		for(int p = 0; p < teachers.size(); p++){
			if(teachers.equals(teachers.get(p)))
				return true;
		
		}
		return false;
	}
	
	/**
	 * Find Method 
	 * 
	 * @param Object from type teacher
	 * @return int - if it's found, return the position, if it's not, returns -1 
	 */
	public int findPos(Teacher t1){
		for (int i=0; i < teachers.size(); i++){
			if(t1.equals(teachers.get(i))){	
				return i;
			}
		}
		return -1;
	}
	/**
	 * Remove Method - Delete a register 
	 * 
	 * @param Object from type teacher 
	 * @throws Message if teacher doens't exist
	 */
	public void removeTeacher(Teacher t1) throws Exception{
		if (findPos(t1) != -1)	
			teachers.remove(findPos(t1));
		else
			throw new Exception("Teacher not found!");
	}
	
	/**
	 * Method that search a teacher on the array
	 * 
	 * @param Object from type teacher 
	 * @throws Message if teacher doens't exist
	 */
	public void searchTeacher(Teacher t) throws Exception{
		int pos = findPos(t);
		if(pos != -1){
			System.out.println(t);
			System.out.println("Courses:  ");
			for(int p = 0; p < teachers.get(pos).getSize(); p++)
				System.out.println("        " + teachers.get(pos).getCourses(p));
	
		}
		else
			throw new Exception("This Teacher doesn't exist.");
	}

	/*
	 * Method that registry a subject on teacher's courses
	 */
	
	public void registry(Teacher teacher , Subject subject) throws Exception{
		boolean  existsTeacher = find(teacher);
		boolean existsSubject = find(subject);
		if( (existsSubject) && (existsTeacher))
			teacher.setCourses(subject);
		else
			throw new Exception("This subject or student doesn't exist.");
	}

	
/*                               SUBJECT'S METHODS                                 */

	/**
	 * Print the Subjects' list	
	 */
	public void showSubjects(){
		for(int p = 0; p < subjects.size(); p++)
			System.out.println(subjects.get(p));
	}
	
	public Subject getSubject(int index){
		return subjects.get(index);
	}
	
	/**
	 * Method that register a new subject, but if the name of the subject already exists it's impossible register it.
	 * @param subject
	 * @throws Exception
	 */
	
	public void subjectRegistration(Subject subject)throws Exception{
		if(find(subject))
			throw new Exception("This subject already exists.");
		else
			subjects.add(subject);	
	}
	/**
	 * Method that remove one subject that exists on subjects' list.
	 * @param subject
	 * @throws Exception
	 */
	
	public void removeSubject(Subject subject) throws Exception{
		int pos = findPos(subject);
		if(pos == -1)
			throw new Exception("This subject don't exists.");
		else
			subjects.remove(pos);		
	}
	/**
	 * Method that look for the subject and return if exists (true) or not (false).
	 * @param subject
	 * @return
	 */
	public  boolean find(Subject subject){
		for(int p = 0; p < subjects.size(); p++){
			if(subject.equals(subjects.get(p)))
				return true;
		
		}
		return false;
	}
	/**
	 * Method that look for the subject's position inside the list of subjects. 
	 * @param subject
	 * @return
	 */
	public int findPos(Subject subject){
		for(int p = 0; p < subjects.size(); p++){
			if(subject.equals(subjects.get(p)))
				return p;
		}
		
		return -1;
	}
	
	
}
