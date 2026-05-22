/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionvehiculos;

/**
 *
 * @author gonzalo.rueda1
 */
public class Coche extends Vehiculo {

    private int numeroPuertas;

    public Coche(String marca, String modelo, int anio, double precioDia, int numeroPuertas) {
        super(marca, modelo, anio, precioDia);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas()              { return numeroPuertas; }
    public void setNumeroPuertas(int puertas) { this.numeroPuertas = puertas; }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Puertas: " + numeroPuertas);
    }
}