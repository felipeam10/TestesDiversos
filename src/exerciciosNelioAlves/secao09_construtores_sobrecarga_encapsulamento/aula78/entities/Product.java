package exerciciosNelioAlves.secao09_construtores_sobrecarga_encapsulamento.aula78.entities;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product() {}

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return "Product{ " +
                "name=' " + name + '\'' +
                String.format("%.2f", price) +
                ", quantity= " + quantity +
                ", Total: $" + String.format("%.2f", totalValueInStock()) +
                " }";
    }
}
