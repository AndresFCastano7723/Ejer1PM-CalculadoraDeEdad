package Modelo;
import Modelo.Fecha;
import java.util.Calendar;

public class Persona{
    private String id, nombre, tel, correo;
    private Fecha fNac;

    public Persona(String id, String nom, String tel, String correo, Fecha fNac) {
        this.id = id;
        this.nombre = nom;
        this.tel = tel;
        this.correo = correo;
        this.fNac = fNac;
    }
    public Persona() {
        this.id = "";
        this.nombre = "";
        this.tel = "";
        this.correo = "";
        this.fNac = new Fecha();
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Fecha getfNac() {
        return fNac;
    }

    public void setfNac(Fecha fNac) {
        this.fNac = fNac;
    }

    @Override
    public String toString() {
        return "Identificacion: " + id + "\nNombre: " + nombre + "\nTelefono: " + tel + "\nCorreo: " + correo + fNac.toString();
    }
    
    public int edad(){
        Calendar fecha=Calendar.getInstance();
        return fecha.get(Calendar.YEAR)-this.fNac.getAa();
        
    }
}