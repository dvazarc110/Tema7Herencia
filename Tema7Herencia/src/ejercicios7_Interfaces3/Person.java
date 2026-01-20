package ejercicios7_Interfaces3;

public abstract class Person {

	protected String type;
	protected String name;
	
	public Person(String type, String name) {
		this.type = type;
		this.name = name;
	}
	
	
	public void numberType() {
	}
 
	@Override
	public String toString() {
		return String.format("\n%s - %s \n", type, name); 
	}  
	
}
