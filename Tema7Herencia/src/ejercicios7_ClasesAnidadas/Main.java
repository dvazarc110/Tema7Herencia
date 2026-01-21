package ejercicios7_ClasesAnidadas;

import java.util.Scanner;

import ejercicios7_Interfaces.ConsoleInput;

public class Main {

	public void createVehicle() {
		
		Scanner keyboard = new Scanner(System.in);
		ConsoleInput consola = new ConsoleInput(keyboard);
		Vehicle vehicle;
		String answer, fueltype, marca;
		int select, displ;
		boolean check = false;
		boolean out = false;
		
		System.out.println("¿Quiere crear un vehículo?\nSÍ (Escriba 1)\nNO (Escriba 2)\n");
		
		do {
			select = consola.readInt();
			
			if(select == 1){
				check = true;
			}else if(select == 2){
				System.out.println("Adios.");
				out = true;
			}else{
				System.out.println("No se ha podido entender su decisión.\n Indique si quiere crear un vehículo (Y/N)\n");
			}
		}while(!check && !out);
		
		if(check) {
			
			System.out.println("\n====== MARCAS ======");
	        System.out.println("1) Seat");
	        System.out.println("2) BMW");
	        System.out.println("3) Volkswagen");
	        System.out.println("4) KIA");
	        System.out.println("5) Hyundai");
	        System.out.println("==============================\n");
	        
	        do {
	        	select = consola.readInt();
	        	if((select < 1) || (select > 5)) {
	        		System.out.println("Fuera de rango.\nSeleccione el tipo de combustible que quiera para su vehículo.\n");
	        	}
	        }while((select < 1) || (select > 5));
			
	        marca = switch (select) {
				case 1 -> "Seat";
				case 2 -> "BMW";
				case 3 -> "Volkswagen";
				case 4 -> "KIA";
				case 5 -> "Hyundai";
				default -> null;
	        };
	        
	        System.out.println("Indique el modelo:\n");
			answer = (consola.readString()).trim();
			
			vehicle = new Vehicle(marca, answer);
			
			System.out.println("\n====== COMBUSTIBLES ======");
	        System.out.println("1) Gasolina");
	        System.out.println("2) Bioetanol");
	        System.out.println("3) Diésel");
	        System.out.println("4) Biodiésel");
	        System.out.println("5) Eléctrico");
	        System.out.println("==============================\n");
	        do {
	        	select = consola.readInt();
	        	if((select < 1) || (select > 5)) {
	        		System.out.println("Fuera de rango.\nSeleccione el tipo de combustible que quiera para su vehículo.\n");
	        	}
	        }while((select < 1) || (select > 5));
	        
	        System.out.println("Indique la cilindrada del motor, o la potencia, en caso de ser eléctrico:\n");
	        do {
	        	displ = consola.readInt();
	        	if((select < 5) && (displ < 50)) {
	        		System.out.println("La cilindrada de su vehículo, mínimo tiene que ser de 50, ya que no es eléctrico.\nVuelva a introducir la cilindrada de su vehículo:\n");
	        	}else if((select == 5) && (displ < 0)) {
	        		System.out.println("Su vehículo eléctrico, como mínimo su potencia debe de ser de 0.\nVuelva a introducir la potencia de su vehículo:\n");
	        	}else {
	        		check = false;
	        	}
	        }while(check);
	        
	        fueltype = switch (select) {
				case 1 -> "Gasolina";
				case 2 -> "Bioetanol";
				case 3 -> "Diésel";
				case 4 -> "Biodiésel";
				case 5 -> "Eléctrico";
				default -> null;
	        };
	        
	        vehicle.installEngine(displ, fueltype);
	        
		}
	}
	
	
	public static void main(String[] args) {
		new Main().createVehicle();
	}

}
