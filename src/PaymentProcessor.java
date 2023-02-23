public class PaymentProcessor {
    public void processTaxExemptPurchase(Account buyer, Account seller, double purchaseAmount){
        if (purchaseAmount < 0) {
            throw new IllegalArgumentException("Purchase amount cannot be less than 0");
        }
        if (purchaseAmount > buyer.getBalance()){
            throw new IllegalArgumentException( "Balance is not enough to purchase");
        }
     buyer.setBalance(buyer.getBalance() - purchaseAmount);
        seller.setBalance(seller.getBalance() + purchaseAmount);
    }
    public void processTaxedPurchase(Account buyer, Account seller, double purchaseAmount){
        if (purchaseAmount < 0) {
            throw new IllegalArgumentException("Purchase amount cannot be less than 0");
        }
        double taxedPurchase = purchaseAmount * 1.14;

        if (taxedPurchase > buyer.getBalance()){
            throw new IllegalArgumentException( "Balance is not enough to purchase");
        }
        buyer.setBalance(buyer.getBalance() - taxedPurchase);
        seller.setBalance(seller.getBalance() + taxedPurchase);
    }

    public void issueRefund ( Account buyer, Account seller, double purchaseAmount, int percent) {
        if (purchaseAmount < 0) {
            throw new IllegalArgumentException("Purchase amount cannot be less than 0");
        }
        if (percent < 0 || percent > 100) {
            throw new IllegalArgumentException("Percent must be between 0 and 100");
        }
        double refundAmount = purchaseAmount * percent / 100;
        buyer.setBalance(buyer.getBalance() + refundAmount);
        seller.setBalance(seller.getBalance() - refundAmount);

    }
}
