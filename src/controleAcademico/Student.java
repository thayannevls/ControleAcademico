/*
 * Author: Thayanne Luiza
 * Date: 11/08/2015
 */
package controleAcademico;
import java.util.*;

public class Student {
	private String name;
	private ArrayList<Subject> roll = new ArrayList();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Subject getRoll(int index) {
		return roll.get(index);
	}
	
	public void setRoll(Subject subject) {
		roll.add(subject);
	}
	
	
}
