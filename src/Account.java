public class Account {
    private String name;
    private String address;
    private int balance;
    private int accountNumber;
    private Hold hold;
    public Account() {

    }

    public Account(String name, String address, int balance, int accountNumber, Hold hold) {
        this.name = name;
        this.address = address;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.hold = hold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Hold getHold() {
        return hold;
    }

    public void setHold(Hold hold) {
        this.hold = hold;
    }
}
