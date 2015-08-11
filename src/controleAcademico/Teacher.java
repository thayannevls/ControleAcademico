/*
 * Autor: Rebeca Galdino
 * Data: 10/08/2015
 * Classe Teacher do projeto Controle Academico - Manipula dados dos professores cadastrados, bem como cadastra novos.
 */
package controleAcademico;

import java.util.*;

public class Teacher {
	/*
	 * ArrayList para armazenamento dos nomes dos professores;
	 */
	private ArrayList<String> names = new ArrayList<String>();
	/*
	 * ArrayList para armazenamento dos niveis de graduacao dos professores
	 */
	private ArrayList<String> graduations = new ArrayList<String>();
	
	
	/*
	 * Constructor da classe Teacher - Inicia os arrayLists e os atributos da classe
	 */
	public Teacher(){
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> graduations = new ArrayList<String>();
		this.names = names;
		this.graduations = graduations;
	}
	
	
	/*
	 * Método de cadastro de um Professor
	 */
	public void teacherRegistration(){
		Scanner s = new Scanner(System.in);
		System.out.println("<<< Register a new Teacher >>>");
		System.out.println("Teacher's name: ");
		String n1;
		n1 = s.nextLine();
		for (int i=0; i < names.size(); i++){
			if (n1 == names.get(i)){
				System.out.println("This teacher is already registrated!");
				break;	
		     }
		}
		names.add(n1);
		System.out.println("Teacher's qualification(ex. Bachelor): ");
		graduations.add(s.nextLine());
		System.out.println("Resgistration completed successfully!");

	}
	
	/*
	 * Metodo de remocao por base em um nome de registro especificado
	 */
	public void removeTeacher(){
		ArrayList <String> names = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		System.out.println("<<< Remove a Teacher registrated >>>");
		System.out.println("Type the Teacher's name to remove: ");
		this.names.remove(s.nextLine());	
	}
	
	/*
	 * Metodo de listagem dos professores
	 */
	public void showTeachers(){
		if (!names.isEmpty()){
	    	for (int i=0; i < names.size(); i++){
	    		System.out.println(names.get(i) + "    " + graduations.get(i) );
	    	}
		} else
			System.out.println("There are no teachers registereds.");
    }
	
	/*
	 * Getters e Setters dos atributos da Classe
	 */
	public ArrayList<String> getNames() {
		return names;
	}


	public void setNames(ArrayList<String> names) {
		this.names = names;
	}
	
	public ArrayList<String> getGraduations() {
		return graduations;
	}


	public void setGraduations(ArrayList<String> graduations) {
		this.graduations = graduations;
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
		if (names == null) {
			if (other.names != null)
				return false;
		} else if (!names.equals(other.names))
			return false;
		return true;
	}
	
	
    
}