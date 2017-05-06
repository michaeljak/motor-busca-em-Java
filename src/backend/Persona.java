package backend;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private String apellido;
    private int edad;
    private String tipoEmpleado;

    public Persona(String nombre, String apellido, int edad, String tipoEmpleado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tipoEmpleado = tipoEmpleado;
    }
    
    public boolean empiezaPor(String inicio) {
        if(inicio.isEmpty() || inicio.length()>apellido.length())
            return false;
        for(int i=0; i<inicio.length(); ++i)
            if( inicio.charAt(i) != apellido.charAt(i) )
                return false;
        return true;
    }
    
    @Override
    public String toString() {
        return "Nombre completo: "+apellido+", "+nombre+
               "\nEdad: "+edad+
               "\nTipo empleado: "+tipoEmpleado;
    }
}
