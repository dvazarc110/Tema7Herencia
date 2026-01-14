package ejercicios7_Interfaces;

import java.util.Scanner;

public class IesSaladillo {

	@SuppressWarnings("resource")
	
	public void createObjects() {
		
		Scanner keyboard = new Scanner(System.in);
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
			System.out.printf("\nPersona número: %d\n¿Profesor o estudiante?\n", i+1);
			while(check == false || recheck == false) {
				answer = keyboard.nextLine();
				answer = (answer.toLowerCase()).concat("asas");
				if((answer.isEmpty()) || (answer.substring(0, 8) == "profesor") || (answer.substring(0, 10) == "estudiante")) {
					System.out.println("No se reconoce el rol de la persona a añadir.\nPor favor indica si la persona es un profesor o un estudiante");
				}else if(answer.substring(0, 8) == "profesor") {
					answer = answer.replace('p', 'P');
					contte = 5;
					while(check == false) {
						if(contte >= personas.length) {
							System.out.println("Ya se han introducido todos los profesores, revisa si los introducidos son correctos o si la persona a introducir realmente es un profesor.");
							check = true;
							recheck = false;
						}else if(personas[contte] == null) {
							System.out.printf("\nIntroduzca el nombre del profesor número: %d\n", contte-4);
							name = keyboard.next();
							System.out.printf("\nIntroduzca el salario del profesor número: %d\n", contte-4);
							salary = keyboard.nextInt();
							teacher = new Teachers (answer, name, salary);
							personas[contte] = new Person[]{teacher};
							check = true;
							recheck = true;
						}else {
							contte++;
							recheck = true;
						}
					}
					
				}else if(answer.substring(0, 10) == "estudiante") {
					answer = answer.replace("est", "Est");
					contst = 0;
					while(check == false) {
						if(contst >= 5) {
							System.out.println("Ya se han introducido todos los estudiantes, revisa si los introducidos son correctos o si la persona a introducir realmente es un estudiante.");
							check = true;
							recheck = false;
						}else if(personas[contst] == null) {
							System.out.printf("\nIntroduzca el nombre del estudiante número: %d\n", contst+1);
							name = keyboard.next();
							double[] grades = new double[3];
							student = new Students (answer, name, grades);
							personas[contst] = new Person[]{student};
							check = true;
							recheck = true;
						}else {
							contst++;
							recheck = true;
						}
					}
				}
			}
		}
		for(int k = 0; k < personas.length; k++) {
			System.out.printf("\n%s\n", personas[k]);
			if(k == 4) {
				System.out.printf("\n\n");
			}
		}
	}
	
	public static void main(String[] args) {

		new IesSaladillo().createObjects();
		
	}
}
