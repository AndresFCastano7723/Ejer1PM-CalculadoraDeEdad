
package Control;

import Modelo.Persona;
import Vista.Entrada;

public class Controlador {
    public Persona e;
    public Entrada in;

    public Controlador() {
        this.e = new Persona();
        this.in = new Entrada();
    }
    
    public void iniciar(){
        System.out.println("Resgistrar datos:\n");
        e.setNombre(in.leerTexto("Nombre: "));
        e.setId(in.leerTexto("ID: "));
        e.setAa(in.leerEntero("Año de nacimiento: "));
        System.out.println("Datos registrados:\n"+e.toString()+"\nEdad: "+e.edad());
    }
}
