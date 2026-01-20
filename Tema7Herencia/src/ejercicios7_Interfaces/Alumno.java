package ejercicios7_Interfaces;

import java.util.ArrayList;

public class Alumno extends Person implements Alumnos1{

    private ArrayList<Double> notas = new ArrayList<>();
	
    
	public Alumno(String type, String name, int position)  {
		super(type, name, position);
	}
	
	
	@Override
	public String toArray(String clase) {
        return "     " + clase + "      ----  " + name;
    }
	
	@Override
	public String numberType() {
		return "Soy el alumno " + position;
	}
	
	@Override
    public void addGrade(double nota) {
        if (notas.size() < 3) {
            notas.add(nota);
        }
    }
	
	@Override
    public String toString() {
        String texto = "Alumno " + name + " , " +
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
