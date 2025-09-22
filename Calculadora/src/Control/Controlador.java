
package Control;

import Modelo.Fecha;
import Modelo.Persona;
import Modelo.Prestamo;
import Vista.Entrada;

public class Controlador {
    public Prestamo pres;
    public Entrada in;

    public Controlador() {
        this.pres = new Prestamo();
        this.in = new Entrada();
    }
    
    public void iniciar(){
        Persona e = new Persona();
        System.out.println("Resgistrar datos:\n");
        e.setNombre(in.leerTexto("Nombre: "));
        e.setId(in.leerTexto("ID: "));
        Fecha ff = new Fecha(in.leerEntero("Dia:"), in.leerEntero("Mes:"), in.leerEntero("Año:"));
        e.setfNac(ff);
        pres.setCliente(e);
        pres.setNroPres(in.leerTexto("ID prestamo: "));
        pres.setValor(in.leerDecimal("Valor de prestamo: "));
        pres.setPlazo(in.leerEntero("Plazo:"));
        pres.setTazaInt(in.leerDecimal("Taza de interes: "));
        System.out.println("Datos registrados:\n"+pres.toString());
    }
}
