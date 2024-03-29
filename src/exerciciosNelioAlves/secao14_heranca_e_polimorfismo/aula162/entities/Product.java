package exerciciosNelioAlves.secao14_heranca_e_polimorfismo.aula162.entities;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String priceTag() {
        return name
                + " $ "
                + String.format("%.2f", price);
    }
}
