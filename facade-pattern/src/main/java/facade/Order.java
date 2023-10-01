package facade;

import models.Invoice;
import models.Notification;
import models.Payment;
import models.Product;

public class Order {

    public void createOrder() {

        System.out.println("\nCreating order...");
        Product product = new Product();
        product.chooseProduct();

        Invoice invoice = new Invoice();
        invoice.generateInvoice();

        Payment payment = new Payment();
        payment.makePayment();

        Notification notification = new Notification();
        notification.sendNotification();
    }

}
