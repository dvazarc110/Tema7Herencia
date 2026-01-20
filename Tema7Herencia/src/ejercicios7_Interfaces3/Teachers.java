package ejercicios7_Interfaces3;

public class Teachers extends Person{

	private int salary;
	private int[] list;
	
	
	public Teachers(String type, String name, int salary)  {
		super(type, name);
		this.salary = salary;
		
	}
	
	@Override
	public void numberType() {
		
	}
}
