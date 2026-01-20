package ejercicio7_InterfacesGpt;

public abstract class Persona {
    protected String nombre;
    protected String type;
    protected boolean validado = false;

    public Persona(String type, String nombre) {
    	this.type = type;
        this.nombre = nombre;
    }

    public void validate() {
        validado = true;
    }

    public boolean isValidated() {
        return validado;
    }
}

