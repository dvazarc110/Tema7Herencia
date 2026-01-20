package ejercicio7_InterfacesGpt;

public class Profesor extends Persona implements Profesor1 {

    private static int contador = 0;
    private int orden;
    private double sueldo;

    public Profesor(String type, String nombre, double sueldo) {
        super(type, nombre);
        this.sueldo = sueldo;
        contador++;
        orden = contador;
    }
    
    @Override
    public String toArray(String clase) {
    	return "    " + clase + "    ---- " + nombre + "----" + sueldo;
    }

    @Override
    public void subirSueldo(double porcentaje) {
        sueldo += sueldo * porcentaje / 100;
    }

    @Override
    public String numberType() {
        return "Soy el profesor número " + orden;
    }

    @Override
    public String toString() {
        return "Profesor " + nombre + " , " +
                (validado ? "Sí validado" : "No validado") +
                ",  Sueldo:" +
                String.format("%.2f", sueldo).replace('.', ',');
    }
}

