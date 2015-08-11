/*
 * Author: Thayanne Luiza
 * Date: 11/08/2015
 * 
 * Exception for the error of the studient already exist in system
 */
package controleAcademico;

public class StudientAlreadyExists extends Exception {
	
	public StudientAlreadyExists() { }
	
	public StudientAlreadyExists(String message) { 
		super(message);
	}
	
}
