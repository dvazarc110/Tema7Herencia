package ejercicios7_Interfaces2;

import java.util.Arrays;
import java.util.Scanner;
import static ejercicios7_Interfaces2.ConsoleInput.*;

public class Students extends People{

	private double[] grades = new double[3];
	private int position;
	private boolean validation;
	private String[][] list1, list2;
	private int cant;
	
	
	public Students(String type, String name, int position, double[] grades, boolean validation)  {
		super(type, name);
		this.position = position;
		this.grades = grades;
		this.validation = validation;
		
	}
	
	public void addStudent(String type) {
		Scanner keyboard = new Scanner(System.in);
		ConsoleInput consola = new ConsoleInput(keyboard);
		boolean check = false;
		boolean added = false;
		System.out.println("Escribe el nombre del usuario");
		name = consola.readString();
		double[] grades = new double[3];
		do {
			for(int i = 0; (i < list1.length) && !added; i++) {
				if(list1[i][0] == null) {
					list1[i] = new String[] {type, name};
					list2[i] = new String[] {type, name};
					added = true;
					check = true;
					new Students (type, name, i, grades, false);
				}
			}
			if(!(list2.length>2) && !added) {
				list1[cant] = new String[] {type, name};
				list2[cant] = new String[] {type, name};
				check = true;
				new Students (type, name, cant+1, grades, false);
			}else if(!added){
				list1 = new String[cant+1][];
				for(int i = 0; i < list2.length; i++) {
					list1[i] = list2[i];
				}
				list1[cant+1] = new String[] {type, name};
				list2 = new String[cant+1][];
				for(int i = 0; i < list1.length; i++) {
					list2[i] = list1[i];
					check = true;
				}
				new Students (type, name, cant+1, grades, false);
			}
			
		}while (!check);
		
		cant++;
		
	}
	
	public void deleteStudent() {
		Scanner keyboard = new Scanner(System.in);
		ConsoleInput consola = new ConsoleInput(keyboard);
		boolean check = false;
		int answernum;
		System.out.println("¿Qué alumno quiere eliminar?");
		for(int i = 0; i < list1.length; i++) {
			System.out.printf("%dº--- %s\n",i+1, list1[i]);
		}
		
		do {
			answernum = consola.readInt();
			if((answernum > list1.length) || (list1[answernum-1][0] == null)) {
				System.out.println("No se ha encontrado el alumno, por favor, vuelva a seleccionar el alumno que quiere seleccionar, o elija salir (0):");
				consola.cleanInput();
			}else {
				list1[answernum] = new String[1];
				list2[answernum] = new String[1];
				check = true;
			}
		}while (!check);
		
	}
	
	public void selectStudentd() {
		Scanner keyboard = new Scanner(System.in);
		ConsoleInput consola = new ConsoleInput(keyboard);
		boolean check = false;
		int answernum;
		System.out.println("¿Qué alumno quiere validar?");
		for(int i = 0; i < list1.length; i++) {
			System.out.printf("%dº--- %s\n",i+1, list1[i]);
		}
		
		do {
			answernum = consola.readInt();
			if((answernum > list1.length) || (list1[answernum-1][0] == null)) {
				System.out.println("No se ha encontrado el alumno, por favor, vuelva a seleccionar el alumno que quiere seleccionar, o elija salir (0):");
				consola.cleanInput();
			}else {
				list1[answernum] = new String[1];
				list2[answernum] = new String[1];
				check = true;
			}
		}while (!check);
	}
	
	public void validate() {
		
	}
	
	@Override
	public void numberType() {
		System.out.printf("Soy el alumno %d", position);
	}
	
	
}
