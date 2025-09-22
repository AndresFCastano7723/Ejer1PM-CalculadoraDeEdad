package Modelo;

public class Prestamo {
    private Persona cliente;
    private String nroPres;
    private int plazo;
    private double valor, tazaInt;

    public Prestamo(Persona cliente, String nroPres, int plazo, double valor, double tazaInt) {
        this.cliente = cliente;
        this.nroPres = nroPres;
        this.plazo = plazo;
        this.valor = valor;
        this.tazaInt = tazaInt;
    }
    
    public Prestamo() {
        this.cliente = new Persona();
        this.nroPres = "";
        this.plazo = 0;
        this.valor = 0;
        this.tazaInt = 0;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public String getNroPres() {
        return nroPres;
    }

    public void setNroPres(String nroPres) {
        this.nroPres = nroPres;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTazaInt() {
        return tazaInt;
    }

    public void setTazaInt(double tazaInt) {
        this.tazaInt = tazaInt;
    }

    @Override
    public String toString() {
        return "\nNro de Prestamo: " + getNroPres() + "\nCliente:\n" + cliente.toString() + "\nPlazo: " + getPlazo() + "\nValor: " + getValor() + "\nTaza de interes: " + getTazaInt();
    }
    
    

}
