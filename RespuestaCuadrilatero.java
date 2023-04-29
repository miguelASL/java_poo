package Ejercicio;

import javax.swing.*;

public class RespuestaCuadrilatero {
    public static void main(String[] args) {
        Cuadrilatero c1;
        float lado1;
        float lado2;

        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un lado: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un lado: "));

        if (lado1 == lado2){
            c1 = new Cuadrilatero(lado1);
        }
        else {
            c1 = new Cuadrilatero(lado1, lado2);
        }
        System.out.println("El perimetro es: " + c1.getPerimetro());
        System.out.println("El area es : " + c1.getArea());
    }

}
