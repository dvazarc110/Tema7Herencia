package ejercicios7_Interfaces;

import java.util.Scanner;



public class IesSaladillo {

	@SuppressWarnings("resource")
	
	public static void main(String[] args) {

        ActionsCenter[] personas = createObjects();
       
        System.out.println();
        System.out.println();
        showArray(personas);
        System.out.println();
        showOrder(personas);
        System.out.println();
        showObjects(personas);
        System.out.println();
        processData(personas);
    }
	
	
	
	public static ActionsCenter[] createObjects() {
		
		Scanner keyboard = new Scanner(System.in);
		ConsoleInput consola = new ConsoleInput(keyboard);
		ActionsCenter[] p;
		String name;
		int contte, contst;
		double salary;
		
		System.out.println("¿Cuantos alumnos quiere introducir?");
		contst = consola.readInt();
		
		System.out.println("¿Cuantos profesores quiere introducir?");
		contte = consola.readInt();

		p = new ActionsCenter[(contst+contte)];

		
		System.out.println("\nAlumnos:");
		for(int i = 0; i < contst; i++) {
			System.out.printf("\nIntroduzca el nombre del alumno número %d : -> ", i+1);
			name = consola.readString();
			p[i] = new Alumno("Alumno", name, i+1);
		}
		
		
		System.out.println("\nProfesores:");
		for(int i = contst; i < p.length; i++) {
			System.out.printf("\nIntroduzca el nombre del profesor número %d : -> ", i-(contst-1));
			name = consola.readString();
			System.out.printf("\nIntroduzca el salario del profesor número %d : -> ", i-(contst-1));
			salary = consola.readDouble();
			p[i] = new Profesor("Profesor", name, i-(contst-1), salary);
			
		}
		
		return p;
		
	}
		
	public static void showArray(ActionsCenter[] array) {
		String type;
    	boolean check = true;
    	System.out.println("Tipo del objeto  ----  Nombre");
        for (ActionsCenter p : array) {
        	type = p.getClass().getSimpleName();
        	if((type.equalsIgnoreCase("profesor")) && (check)) {
        		System.out.println("\nTipo del objeto  ----  Nombre  ----  Sueldo");
        	}
            System.out.println(p.toArray(type));
        }
	}
	
	public static void showOrder(ActionsCenter[] array) {
        for (ActionsCenter p : array) {
            System.out.println(p.numberType());
        }
    }
	
	public static void showObjects(ActionsCenter[] array) {
        for (ActionsCenter p : array) {
            System.out.println(p);
        }
    }

    public static void processData(ActionsCenter[] array) {

        for (int i = 0; i < array.length; i++) {

            ActionsCenter p = array[i];
            p.validate();

            if (p instanceof Alumnos1) {
                double nota = 2.5;
                for (int j = 0; j < i; j++) {
                    ((Alumnos1) p).addGrade(nota);
                    nota += 2.5;
                }
            }

            if (p instanceof Profesores1) {
                ((Profesores1) p).riseSalary(i * 10);
            }
        }

        showObjects(array);
    }
}