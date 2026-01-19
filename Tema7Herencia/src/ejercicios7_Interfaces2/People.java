package ejercicios7_Interfaces2;

public abstract class People {

	protected String type;
	protected String name;
	
	public People(String type, String name) {
		this.type = type;
		this.name = name;
	}
	
	
	public void addPeople() {
		
	}
	
	public void numberType() {
	}
 
	@Override
	public String toString() {
		return String.format("\n%s - %s \n", type, name); 
	}  
	
}
