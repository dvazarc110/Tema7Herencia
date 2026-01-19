package ejercicios7_Interfaces2;

import java.util.Scanner;
import static ejercicios7_Interfaces2.ConsoleInput.*;
import static ejercicios7_Interfaces2.People.*;


public class IesSaladillo {

	@SuppressWarnings("resource")
	
	public void createObjects() {
		
		Scanner keyboard = new Scanner(System.in);
		ConsoleInput consola = new ConsoleInput(keyboard);
		People[][] personas;
		Students student;
		Teachers teacher;
		int answernum;
		String answer, name;
		boolean check = false;
		boolean recheck = true;
		int contte, contst, salary;
		personas = new People[8][3];
		
		System.out.println("¡Buenos días!");
		
		System.out.printf("¿Con qué quieres trabajar?\n1º--- Profesor.(1)\n2º--- Alumno.(2)\n");

		while(!check) {
			answernum = consola.readInt();
			switch (answernum) {
				case 1 -> new IesSaladillo().Student();
				case 2 -> new IesSaladillo().Teacher();
				default -> null;
			};
		}
	}
	
	public void Student() {
		
		Scanner keyboard = new Scanner(System.in);
		ConsoleInput consola = new ConsoleInput(keyboard);
		People[][] personas;
		Students student;
		Teachers teacher;
		int answernum;
		String answer, name;
		boolean check = false;
		boolean recheck = true;
		int contte, contst, salary;
		personas = new People[8][3];
		
		System.out.printf("¿Qué quiere hacer?\n1º--- Añadir un alumno.(1)\n2º--- Eliminar un alumno.(2)\n3º--- Validar un alumno.(3)\n4º--- Añadir una nota a un alumno.(4)");
		
		while(!check) {
			answernum = consola.readInt();
			student = switch (answernum) {
				case 1 -> ;
				case 2 -> 
				case 3 -> 
				case 4 -> 
				case 5 -> 
				default -> null;
			};
		}
	}
	
	public void Teacher() {
		
		Scanner keyboard = new Scanner(System.in);
		ConsoleInput consola = new ConsoleInput(keyboard);
		People[][] personas;
		Students student;
		Teachers teacher;
		int answernum;
		String answer, name;
		boolean check = false;
		boolean recheck = true;
		int contte, contst, salary;
		personas = new People[8][3];
		
		System.out.printf("¿Qué quiere hacer?\n1º--- Añadir un profesor.(1)\n2º--- Eliminar un profesor.(2)\n3º--- Validar un profesor.(3)\n4º--- Modificar el sueldo de un profesor.(4)\n");
		
		while(!check) {
			answernum = consola.readInt();
			switch (answernum) {
				case 1 -> student.addStudent("Alumno");
				case 2 -> deleteperson();
				case 3 -> validate();
				case 4 -> increasesalary();
				case 5 -> addgrade();
				default -> null;
			};
		}
	}
	
		/*System.out.printf("¿Qué quiere hacer?\n1º--- Añadir una persona.(1)\n2º--- Eliminar una persona.(2)\n3º--- Validar una persona.(3)\n4º--- Modificar el sueldo de un profesor.(4)\n5º--- Añadir una nota a un alumno.(5)");
		
		while(!check) {
			answernum = consola.readInt();
			personas = switch (answernum) {
				case 1 -> System.out.printf("¿Qué quiere añadir?\n1º--- Profesor.(1)\n2º--- Alumno.(2)");
				case 2 -> deleteperson();
				case 3 -> validate();
				case 4 -> increasesalary();
				case 5 -> addgrade();
				default -> null;
			};
		}*/
		
		
	
		/*for(int i = 0; i < personas.length; i++) {
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
		}*/
	
	
	public static void main(String[] args) {

		new IesSaladillo().createObjects();
		
	}
}
