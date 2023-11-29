package exerciciosNelioAlves.secao18_interfaces.aula230.services;

public interface OnlinePaymentService {

    double paymentFee(double amount); /* paymentFee = taxa de pagamento */
    double interest(double amount, int months);  /* interest = juros */
}
