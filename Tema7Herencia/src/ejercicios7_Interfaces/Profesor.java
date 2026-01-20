package ejercicios7_Interfaces;

public class Profesor extends Person implements Profesores1{

	private double salary;	
	
	public Profesor(String type, String name, int position, double salary)  {
		super(type, name, position);
		this.salary = salary;
		
	}
	
	 @Override
	 public String toArray(String clase) {
		 return "    " + clase + "     ----  " + name + " ---- " + salary;
	 }
	
	 @Override
	 public String numberType() {
		 return "Soy el profesor " + position;
	 }
	 
	 @Override
	 public void riseSalary(double porcentaje) {
		 salary += salary * porcentaje / 100;
	 }
	 
	 @Override
	    public String toString() {
	        return "Profesor " + name + " , " +
	                (validado ? "Sí validado" : "No validado") +
	                ",  Sueldo:" +
	                String.format("%.2f", salary).replace('.', ',');
	    }
}
