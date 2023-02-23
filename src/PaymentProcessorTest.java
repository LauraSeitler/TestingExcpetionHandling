import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentProcessorTest {
    private Account buyer;
    private Account seller;
    private PaymentProcessor paymentProcessor = new PaymentProcessor();



    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        buyer = new Account();
        buyer.setBalance(1000);

        seller = new Account();
        seller.setBalance(1000);
    }
    @Test
    public void processTaxExcemptPurchase_GoodData_Works(){
        paymentProcessor.processTaxExemptPurchase(buyer, seller, 500);
        assertEquals(500, buyer.getBalance());
        assertEquals(500, seller.getBalance());
    }
    @Test
    public void processTaxedPurchase_GoodData_Works(){
        paymentProcessor.processTaxedPurchase(buyer, seller, 500);
        assertEquals(430, buyer.getBalance());
        assertEquals(1570, seller.getBalance());
    }
    @Test
    public void processTaxedPurchase_InsufficientBuyerBalance_Throws(){
       assertThrows(IllegalArgumentException.class, ()-->paymentProcessor.processTaxedPurchase(buyer, seller, 1500));
    }
    @Test
    public void processTaxedPurchase_InvalidPurchaseAmount_Throws(){
        assertThrows(IllegalArgumentException.class, ()-->paymentProcessor.processTaxedPurchase(buyer, seller, -500));
    }
    @Test
    public void IssueRefund_InvalidRefundPercentage_Throws(){
        assertThrows(IllegalArgumentException.class, ()-->paymentProcessor.issueRefund(buyer, seller, 1500, 150));
        assertThrows(IllegalArgumentException.class, ()-->paymentProcessor.issueRefund(buyer, seller, 1500, -60));
    }
    @Test
    public void IssueRefund_InvalidRefundAmount_Throws(){
        assertThrows(IllegalArgumentException.class, ()-->paymentProcessor.issueRefund(buyer, seller, -500, 150));

    }
    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void processTaxExemptPurchase() {
    }

    @org.junit.jupiter.api.Test
    void processTaxedPurchase() {
    }

    @org.junit.jupiter.api.Test
    void issueRefund() {
    }
}