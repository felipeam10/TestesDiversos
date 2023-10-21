package exerciciosNelioAlves.secao08_introducao_poo.aula70v02.utils;

public class Calculator {

    public final double PI = 3.14159;

    public double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public double volume(double radius) {
        return 4.0 * PI * Math.pow(radius, 3) / 3.0;
    }
}
