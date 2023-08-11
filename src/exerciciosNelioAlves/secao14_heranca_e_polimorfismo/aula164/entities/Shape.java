package exerciciosNelioAlves.secao14_heranca_e_polimorfismo.aula164.entities;

import exerciciosNelioAlves.secao14_heranca_e_polimorfismo.aula164.entities.enums.Color;

public abstract class Shape {

    private Color color;

    public Shape(){}

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract Double area();
}
