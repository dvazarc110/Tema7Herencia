package ejercicio7_Clases_Abstractas;

public abstract class GeometricFigure {

	protected String color;
	protected String figure;
	
	public GeometricFigure(String figure, String color) {
		this.figure = figure;
		this.color = color;
	}
	
	public abstract double calculateArea();

	@Override
	public String toString() {
		return String.format("Figura: %s \nColor: %s \nArea: %.2f \n", figure, color, calculateArea()); 
	}  
	
}
