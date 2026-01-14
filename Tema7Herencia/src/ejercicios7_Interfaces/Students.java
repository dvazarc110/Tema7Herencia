package ejercicios7_Interfaces;

public class Students extends Person{

	private double[] grades = new double[3];
	private int[] list;
	
	
	public Students(String type, String name, double[] grades)  {
		super(type, name);
		this.grades = grades;
		
	}
	
	@Override
	public void numberType() {
		
	}
	
	
}
