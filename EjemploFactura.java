package org.msarmiento.appfacturas;

import org.msarmiento.appfacturas.modelo.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Miguel");

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese una descripcion de la factura: ");
        String desc = s.nextLine();
        Factura factura = new Factura(desc, cliente);

        Producto producto;
        String nombre;
        float precio;
        int cantidad;

        System.out.println();

        for (int i = 0; i < 5; i++){
            producto = new Producto();
            System.out.print("Ingrese produto nª " + producto.getCodigo() + ": ");
            nombre = s.nextLine();
            producto.setNombre(nombre);

            System.out.print("Ingrese el precio: ");
            precio = s.nextFloat();
            producto.setPrecio(precio);

            System.out.print("Ingrese la cantidad: ");
            cantidad = s.nextInt();

            ItemFactura item = new ItemFactura(cantidad, producto);
            factura.addItemsFactura(item);
            System.out.println();
            s.nextLine();
        }
        System.out.println(factura.generarDetalle());

    }
}
