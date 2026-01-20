package ejercicio7_InterfacesGpt;

public class IesSaladillo {

    public static void main(String[] args) {

        Persona1[] personas = crearObjetos();

        showArray(personas);
        System.out.println();
        showOrder(personas);
        System.out.println();
        showObjects(personas);
        System.out.println();
        processData(personas);
    }

    public static Persona1[] crearObjetos() {

        Persona1[] p = new Persona1[]{
                new Alumno("Alumno", "Maria Espinosa"),
                new Alumno("Alumno", "Jose Valverde"),
                new Alumno("Alumno", "Juan Ruiz"),
                new Alumno("Alumno", "Pepe Perez"),
                new Alumno("Alumno", "Rosa Mancebo"),
                new Profesor("Profesor", "Eva Rojas", 1500),
                new Profesor("Profesor", "Ana Mijas", 1700),
                new Profesor("Profesor", "Javier Cuevas", 1200)
        };

        return p;
    }

    public static void showArray(Persona1[] array) {
    	String type;
    	boolean check = true;
    	System.out.println("Tipo del objeto ---- Nombre");
        for (Persona1 p : array) {
        	type = p.getClass().getSimpleName();
        	if((p.getClass().getSimpleName() == "Profesor") && (check)) {
        		System.out.println("\nTipo del objeto ---- Nombre ---- Sueldo");
        	}
            System.out.println(p.toArray(type));
        }
    }
    
    public static void showOrder(Persona1[] array) {
        for (Persona1 p : array) {
            System.out.println(p.numberType());
        }
    }

    public static void showObjects(Persona1[] array) {
        for (Persona1 p : array) {
            System.out.println(p);
        }
    }

    public static void processData(Persona1[] array) {

        for (int i = 0; i < array.length; i++) {

            Persona1 p = array[i];
            p.validate();

            if (p instanceof Alumno1) {
                double nota = 2.5;
                for (int j = 0; j < i; j++) {
                    ((Alumno1) p).addNota(nota);
                    nota += 2.5;
                }
            }

            if (p instanceof Profesor1) {
                ((Profesor1) p).subirSueldo(i * 10);
            }
        }

        showObjects(array);
    }
}
