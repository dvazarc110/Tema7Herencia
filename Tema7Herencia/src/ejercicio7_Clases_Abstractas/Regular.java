package ejercicio7_Clases_Abstractas;

public class Regular extends GeometricFigure{

	private double sides; //lados
	private double sidelength; //longitud del lado
	private double apothem; //apotema
	private double centang; //angulo central
	
	public Regular(String figure, String color, double sides, double sidelength) {
		super(figure,color);
		this.sides = sides;
		this.sidelength = sidelength;
		this.centang = Math.toRadians(360/(2*sides));
		this.apothem = sidelength/(2*Math.tan(centang));
	}
	
	@Override
	public double calculateArea() { 
		
		return ((sides*sidelength)*apothem)/2;
		
		//return ((sides*sidelength)*(sidelength/(2*Math.tan(Math.toRadians(360/(2*sides))))))/2;
	}
	
}
