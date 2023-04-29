package Ejercicio;

import java.util.Scanner;

public class RespuestaTriangulo {
    public static double mayorArea(TriangulosIsosceles tri []){
        double area;

        area = tri[0].Area();
        for (int i = 1; i < tri.length; i++){
            if (tri[i].Area()> area){
                area =  tri[i].Area();
            }
        }
        return area;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double base;
        double lado;
        int numeroTriangulos;

        System.out.println("Diga cuantos triangulos habra: ");
        numeroTriangulos = s.nextInt();

        TriangulosIsosceles tri [] = new TriangulosIsosceles[numeroTriangulos] ;

        for (int i = 0; i< tri.length ; i++){
            System.out.println("Diga los valores para los valores del triangulo " +  (i+1) + " :");
            System.out.println("Diga la base del triangulo: ");
            base = s.nextDouble();
            System.out.println("Diga el lado del triangulo: ");
            lado = s.nextDouble();

            tri[i] = new TriangulosIsosceles(base, lado);

            System.out.println("\nEl perimetro del triangulo es: " + tri[i].obtenerPerimetro());
            System.out.println("\nEl area del triangulo es: " + tri[i].Area());
        }
        System.out.println("El area de mayor superficie es: " + mayorArea(tri));
    }
}
