package ejercicio7_Clases_Abstractas;

public class main {
	
	public void show() {
		
		GeometricFigure[] geometric;
		
		Rectangle r1= new Rectangle("Rectángulo", "Rojo", 5, 3);
		Circle c1= new Circle("Círculo", "verde", 3);
		Triangle t1= new Triangle("Triángulo", "Amarillo", 8, 4);
		Regular re1 = new Regular("Hexágono", "Azul", 6, 3.1);
		
		geometric = new GeometricFigure[] {r1, c1, t1, re1};
		
		for(int i = 0; i < geometric.length; i++) {
			System.out.printf("%dº \n%s\n", i+1, geometric[i]);
		}
		

	}

	public static void main(String[] args) {

		new main().show();
		
	}

}
