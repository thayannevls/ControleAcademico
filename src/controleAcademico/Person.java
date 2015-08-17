package controleAcademico;

public class Person {
	private String name;
	private String cpf;
	private String birthDate;
	private String gender;
	
	
    
	/**
	 * @param name
	 * @param cpf
	 * @param birthDate
	 * @param gender
	 */
	public Person(String name, String cpf, String birthDate, String gender) {
		this.name = name;
		this.cpf = cpf;
		this.birthDate = birthDate;
		this.gender = gender;
	}
	
	public Person(String name){
		this.name = name;
	}



	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Person))
			return false;
		Person other = (Person) obj;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	protected String getName() {
		return name;
	}



	protected String getCpf() {
		return cpf;
	}



	protected String getBirthDate() {
		return birthDate;
	}



	protected String getGender() {
		return gender;
	}



	protected void setName(String name) {
		this.name = name;
	}



	protected void setCpf(String cpf) {
		this.cpf = cpf;
	}



	protected void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}



	protected void setGender(String gender) {
		this.gender = gender;
	}
	
	public String toString(){
		return getName() ;
	}
}
