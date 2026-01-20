package ejercicios7_Interfaces3;

public class Students extends Person{

	private double[] grades = new double[3];
	private int position;
	private int[] list;
	
	
	public Students(String type, String name, int position, double[] grades)  {
		super(type, name);
		this.position = position;
		this.grades = grades;
		
	}
	
	@Override
	public void numberType() {
		System.out.printf("Soy el alumno %d", position);
	}
	
	
}
