package exerciciosNelioAlves.secao18_interfaces.aula225.entities;

public class Invoice { /* Invoice = fatuta */

    private Double basicPayment;
    private Double tax;
    public Invoice(){}

    public Invoice(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    public Double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getTotalPayment() {
        return getBasicPayment() + getTax();
    }
}
