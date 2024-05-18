package files;

public class Transaction  {

    private String accountNumber = "";
    private String amount = "";

    public Transaction(){}

    public Transaction(String amount, String accountNumber) {
        this.amount = amount;
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAmount() {
        return amount;
    }
}
