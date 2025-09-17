//Andres Felipe Castaño - 20231578079

package Modelo;

import java.util.Calendar;

public class Persona {
    private String id, nombre;
    private int aa;

    public Persona(String id, String nombre, int aa) {
        this.id = id;
        this.nombre = nombre;
        this.aa = aa;
    }

    public Persona() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAa() {
        return aa;
    }

    public void setAa(int aa) {
        this.aa = aa;
    }
    
    @Override
    public String toString(){
        return "\nId:\t" + getId() + "\nNombre:\t" + getNombre() + "\nAño de nacimento:\t" + getAa();
    }
    
    public int edad(){
        Calendar fecha = Calendar.getInstance();
        return fecha.get(Calendar.YEAR)-this.aa;
    }
}
