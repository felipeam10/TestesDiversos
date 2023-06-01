package exerciciosNelioAlves.aula146.application;

import exerciciosNelioAlves.aula146.entities.Order;
import exerciciosNelioAlves.aula146.enums.OrderStatus;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Order order = new Order(1120, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
