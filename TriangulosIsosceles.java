package Ejercicio;

public class TriangulosIsosceles {
    private double base;
    private double lado;

    public TriangulosIsosceles(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }

    public double obtenerPerimetro() {
        double perimetro = (lado * 2) + base;
        return perimetro;
    }

    public double Area() {
        double area = (base * Math.sqrt((lado * lado) - ((base * base) / 4))) / 2;
        return area;
    }
}
