package ejercicio7_Clases_Abstractas;

public class Circle extends GeometricFigure{

	private double radius;
	
	public Circle(String figure, String color, double radius) {
		super (figure, color);
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		
		return Math.PI * (radius*radius); 
	}
	
}
