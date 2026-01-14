package ejercicio7_Clases_Abstractas;

public class main2 {
	
	public void show() {
		Rectangle r1= new Rectangle("Rectángulo", "Rojo", 5, 3);
		Circle c1= new Circle("Círculo", "verde", 3);
		Triangle t1= new Triangle("Triángulo", "Amarillo", 8, 4);
		
		//System.out.printf("--RECTANGULO--\nArea: %.2f\n\n--CIRCULO--\nArea: %.2f\n\n--TRIANGULO--\nArea: %.2f\n", r1.calculateArea(), c1.calculateArea(), t1.calculateArea());
		System.out.println(r1);
		System.out.println(c1);
		System.out.println(t1);
	}

	public static void main(String[] args) {

		new main2().show();
		
	}

}
