package ejercicios7_ClasesAnidadas;

public class Vehicle {

	private String brand;
	private String model;
	private Engine engine;
	
	public Vehicle(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	
	
	public class Engine extends Vehicle{
		
		private int displacement;
		private String fuelType;
		
		public Engine(String brand, String model, int displacement, String fuelType) {
			super(brand, model);
			this.displacement = displacement;
			this.fuelType = fuelType;
		}
		
		@Override
		public String toString() {
			if(fuelType == "Eléctrico") {
				return "Marca: " + brand + ".\nModelo: " + model + ".\nCombustible: " + fuelType + ".\nPotencia: " + displacement + ".";
			}else {
				return "Marca: " + brand + ".\nModelo: " + model + ".\nCombustible: " + fuelType + ".\nCilindrada: " + displacement + ".";
			}
			
		}
		
	}
	
	public void installEngine(int displacement, String fuelType) {
		engine = new Engine(brand, model, displacement, fuelType);
		System.out.println(engine);
	}
	
	@Override
	public String toString() {
		return "Marca: " + brand + ".\nModelo: " + model +".";
	}
}
