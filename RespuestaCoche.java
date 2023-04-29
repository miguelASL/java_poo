package Ejercicio;

import java.util.Scanner;

public class RespuestaCoche {
    public static int indiceCocheMasBarato(Coche coche[]){
        float precio;
        int indice = 0;

        precio = coche[0].getPrecio();
        for (int i = 1; i < coche.length; i++){
            if (coche[i].getPrecio() < precio){
                precio = coche[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String marca;
        String modelo;
        float precio;
        int numeroVehiculos;
        int indiceCocheMasBarato;

        System.out.print("Cuantos vehiculos habrá? ");
        numeroVehiculos = s.nextInt();

        //Creamos los objetos para los coches.

        Coche coche [] = new Coche[numeroVehiculos];
        for (int i = 0; i < coche.length; i++){
            s.nextLine();
            System.out.println("\nDiga las caracteristicas del coche " + (i+1));
            System.out.print("Diga la marca: ");
            marca = s.nextLine();
            System.out.print("Diga el modelo: ");
            modelo = s.nextLine();
            System.out.print("Diga el precio: ");
            precio = s.nextFloat();

            coche[i] = new Coche(marca, modelo, precio);
        }

        indiceCocheMasBarato = indiceCocheMasBarato(coche);
        System.out.println("\nEl coche mas barato es: ");
        System.out.println(coche[indiceCocheMasBarato].mostrarDatos());
    }
}