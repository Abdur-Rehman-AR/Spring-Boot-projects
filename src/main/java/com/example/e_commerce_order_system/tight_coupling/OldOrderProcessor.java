package com.example.e_commerce_order_system.tight_coupling;

public class OldOrderProcessor {

    /*
     * The architecture is tightly coupled as we are forced to hardcode the
     * configuration inside the processor. If i want to switch to a Yahoo server
     * tomorrow, then i am forced to change the source code of the processor itself.
     */
    private EmailNotification en = new EmailNotification("SMTP.gmail.com");

    public void processOrder() {
        System.out.println();
        System.out.println("order is getting processed.");
        en.sendEmail();
    }
}