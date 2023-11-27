package exerciciosNelioAlves.secao18_interfaces.services;

public interface OnlinePaymentService {

    double paymentFee(double amount); /* paymentFee = taxa de pagamento */
    double interest(double amount, int months);  /* interest = juros */
}
