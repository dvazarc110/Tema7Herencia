package ejercicio7_Clases_Abstractas;

public class Triangle extends GeometricFigure{

	private double base;
	private double height;
	
	public Triangle(String figure, String color, double base, double height) {
		super(figure,color);
		this.base= base;
		this.height= height;
	}

	@Override
	public double calculateArea() {

		return (base * height)/2; 
	}
}
