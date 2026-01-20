package ejercicio7_InterfacesGpt;

import java.util.ArrayList;

public class Alumno extends Persona implements Alumno1 {

    private static int contador = 0;
    private int orden;
    private ArrayList<Double> notas = new ArrayList<>();

    public Alumno(String type, String nombre) {
        super(type, nombre);
        contador++;
        orden = contador;
    }

    @Override
    public String toArray(String clase) {
        return "     " + clase + "     ---- " + nombre;
    }
    
    @Override
    public void addNota(double nota) {
        if (notas.size() < 3) {
            notas.add(nota);
        }
    }

    @Override
    public String numberType() {
        return "Soy el alumno número " + orden;
    }

    @Override
    public String toString() {
        String texto = "Alumno " + nombre + " , " +
                (validado ? "Sí validado" : "No validado") + ",  ";

        if (!notas.isEmpty()) {
            texto += "\n    Notas:";
            for (int i = 0; i < notas.size(); i++) {
                texto += "\n    Nota " + (i + 1) + ":" +
                        String.format("%.2f", notas.get(i)).replace('.', ',');
            }
        }
        return texto;
    }
}

