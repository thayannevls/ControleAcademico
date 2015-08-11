/*
 * Autor: Rebeca Galdino
 * Data: 10/08/2015
 * Classe Teacher do projeto Controle Academico - Manipula dados dos professores cadastrados, bem como cadastra novos.
 */
package controleAcademico;


public class Teacher {
	private String name;
	/*
	 * Constructor da classe Teacher - Inicia os arrayLists e os atributos da classe
	 */
	public Teacher(String name){
		this.name = name;
	}
	
	
	/*
	 * Getters e Setters dos atributos da Classe
	 */
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	/*
	 * toString
	 */
	public String toString(){
		return getName() + "\n";
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	
}
