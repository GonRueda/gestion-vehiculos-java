/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionvehiculos;

/**
 *
 * @author gonzalo.rueda1
 */
public class Motocicleta extends Vehiculo {

    private boolean tieneMaletero;

    public Motocicleta(String marca, String modelo, int anio, double precioDia, boolean tieneMaletero) {
        super(marca, modelo, anio, precioDia);
        this.tieneMaletero = tieneMaletero;
    }

    public boolean isTieneMaletero()              { return tieneMaletero; }
    public void setTieneMaletero(boolean maletero) { this.tieneMaletero = maletero; }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Maletero: " + (tieneMaletero ? "Sí" : "No"));
    }
}