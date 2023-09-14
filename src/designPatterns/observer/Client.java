package designPatterns.observer;

public class Client {
    public static void main(String[] args) {
        //creating producer
        Amazon amazon = Amazon.getInstance();
        //creating subscribers and registering them to producer class for getting intimation
        CustomerNotifier customerNotifier = new CustomerNotifier();
        InventoryManager inventoryManager = new InventoryManager();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        CashBackGenerator cashBackGenerator = new CashBackGenerator();
        a.orderPlaced();
        a.deRegisterOrderPlacedSubscriber(cashBackGenerator);
        System.out.println("---------------");
        a.orderPlaced();

    }
}