package ejercicios7_Interfaces3;

import java.util.Scanner;

public class IesSaladillo {

	@SuppressWarnings("resource")
	
	public void createObjects() {
		
		Scanner keyboard = new Scanner(System.in);
		ConsoleInput consola = new ConsoleInput(keyboard);
		Person[][] personas;
		Students student;
		Teachers teacher;
		String answer, name;
		boolean check = false;
		boolean recheck = true;
		int contte, contst, salary;
		personas = new Person[8][3];
		
		for(int i = 0; i < personas.length; i++) {
			check = false;
			System.out.printf("Persona número: %d\n¿Profesor o alumno?\n", i+1);
			while(check == false || recheck == false) {
				answer = consola.readString();
				if(answer.equalsIgnoreCase("profesor")) {
					answer = answer.replace('p', 'P');
					contte = 5;
					while(check == false) {
						if(contte >= personas.length) {
							System.out.println("Ya se han introducido todos los profesores, revisa si los introducidos son correctos o si la persona a introducir realmente es un profesor.");
							check = true;
							recheck = false;
						}else if((personas[contte][0]) == null) {
							System.out.printf("\nIntroduzca el nombre del profesor número: %d\n", contte-4);
							name = consola.readString();
							System.out.printf("\nIntroduzca el salario del profesor número: %d\n", contte-4);
							salary = consola.readInt();
							teacher = new Teachers (answer, name, salary);
							personas[contte] = new Person[]{teacher};
							check = true;
							recheck = true;
						}else {
							contte++;
							recheck = true;
						}
					}
					consola.cleanInput();
					
				}else if(answer.equalsIgnoreCase("alumno")) {
					answer = answer.replace("a", "A");
					contst = 0;
					while(check == false) {
						if(contst >= 5) {
							System.out.println("Ya se han introducido todos los alumnos, revisa si los introducidos son correctos o si la persona a introducir realmente es un alumno.");
							check = true;
							recheck = false;
						}else if((personas[contst][0]) == null) {
							System.out.printf("\nIntroduzca el nombre del alumno número: %d\n", contst+1);
							name = consola.readString();
							double[] grades = new double[3];
							student = new Students (answer, name, contst, grades);
							personas[contst] = new Person[]{student};
							check = true;
							recheck = true;
							
						}else {
							contst++;
							recheck = true;
						}
					}
					
					
				}else if((answer.isBlank()) || (!(answer.equalsIgnoreCase("profesor")) && !(answer.equalsIgnoreCase("alumno")))) {
					System.out.println("No se reconoce el rol de la persona a añadir.\nPor favor indica si la persona es un profesor o un alumno");
				}
			}
		}
		
		System.out.println("Tipo de objeto - Nombre");
		for(int k = 0; k < personas.length; k++) {
			System.out.printf("\n%s\n", personas[k]);
			if(k == 4) {
				System.out.printf("\nTipo de objeto - Nombre\n");
			}
		}
	}
	
	public static void main(String[] args) {

		new IesSaladillo().createObjects();
		
	}
}
