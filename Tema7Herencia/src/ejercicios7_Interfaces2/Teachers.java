package ejercicios7_Interfaces2;

import java.util.Scanner;
import static ejercicios7_Interfaces2.ConsoleInput.*;

public class Teachers extends People{

	private int salary;
	private int[] list;
	
	
	public Teachers(String type, String name, int salary)  {
		super(type, name);
		this.salary = salary;
		
	}
	
	@Override
	public void numberType() {
		
	}
}
