package ejercicio7_Clases_Abstractas;

public class Rectangle extends GeometricFigure{

	private double width; //ancho
	private double height; //altura
	
	public Rectangle(String figure, String color, double width, double heigth) {
		super(figure,color);
		this.width= width;
		this.height= heigth;
	}
	
	
	@Override
	public double calculateArea() { 
		
		return width * height;
	}
	
}
