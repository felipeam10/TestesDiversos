package exerciciosNelioAlves.aula691.entities;

public class Rectangle {

    public double width;
    public double weight;

    public double area() {
        return width * weight;
    }

    public double perimeter() {
        return area() * 2;
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(weight, 2));
    }

}
