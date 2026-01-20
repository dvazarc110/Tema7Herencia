package ejercicios7_Interfaces;

public abstract class Person {

	protected String type;
	protected String name;
	protected int position;
    protected boolean validado = false;

	public Person(String type, String name, int position) {
		this.type = type;
		this.name = name;
		this.position = position;
	}
	
	
	public void validate() {
        validado = true;
    }

    public boolean isValidated() {
        return validado;
    }
	
 
	@Override
	public String toString() {
		return String.format("\n%s - %s \n", type, name); 
	}  
	
}
