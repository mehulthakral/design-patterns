import facade.Order;
import models.Invoice;
import models.Notification;
import models.Payment;
import models.Product;

public class Main {

    public static void main(String[] args) {

        // Client needs to follow all the steps for order creation
        // Client needs to change in case order of steps change in the operation
        // or any step undergoes logic/signature change
        Product product = new Product();
        product.chooseProduct();

        Invoice invoice = new Invoice();
        invoice.generateInvoice();

        Payment payment = new Payment();
        payment.makePayment();

        Notification notification = new Notification();
        notification.sendNotification();

        // With facade client doesn't have to know about ordering steps & logic
        Order order = new Order();
        order.createOrder();
    }
}
