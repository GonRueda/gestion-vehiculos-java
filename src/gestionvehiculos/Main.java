/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionvehiculos;

/**
 *
 * @author gonzalo.rueda1
 */
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Coche("Toyota",  "Corolla", 2022, 45.0, 5));
        vehiculos.add(new Coche("Ford",    "Focus",   2020, 38.0, 3));
        vehiculos.add(new Motocicleta("Yamaha", "MT-07",     2021, 30.0, false));
        vehiculos.add(new Motocicleta("Honda",  "CB500F",    2023, 25.0, true));

        for (Vehiculo v : vehiculos) {
            v.mostrarInformacion();       // polimorfismo en acción
            System.out.println("-------------------");
        }
    }
}