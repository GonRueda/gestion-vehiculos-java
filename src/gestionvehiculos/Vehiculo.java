/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionvehiculos;

/**
 *
 * @author gonzalo.rueda1
 */
public class Vehiculo {
 
    private String marca;
    private String modelo;
    private int anio;
    private double precioDia;

    public Vehiculo(String marca, String modelo, int anio, double precioDia) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precioDia = precioDia;
    }

    public String getMarca()       { return marca; }
    public String getModelo()      { return modelo; }
    public int getAnio()           { return anio; }
    public double getPrecioDia()   { return precioDia; }

    public void setMarca(String marca)         { this.marca = marca; }
    public void setModelo(String modelo)       { this.modelo = modelo; }
    public void setAnio(int anio)              { this.anio = anio; }
    public void setPrecioDia(double precioDia) { this.precioDia = precioDia; }

    public void mostrarInformacion() {
        System.out.println("Marca: "           + marca);
        System.out.println("Modelo: "          + modelo);
        System.out.println("Año: "             + anio);
        System.out.println("Precio por día: "  + precioDia + "€");
    }
}