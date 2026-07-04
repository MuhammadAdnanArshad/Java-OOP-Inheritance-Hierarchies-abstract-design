public abstract class PaymentMethod {
    private double amount;
    private String cruency;
    private String accountowner;

    public PaymentMethod() {
    }

    public PaymentMethod(double amount, String cruency, String accountowner) {
        this.amount = amount;
        this.cruency = cruency;
        this.accountowner = accountowner;
    }

    public void setAccountowner(String accountowner) {
        this.accountowner = accountowner;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCruency(String cruency) {
        this.cruency = cruency;
    }

    public String getAccountowner() {
        return accountowner;
    }

    public double getAmount() {
        return amount;
    }

    public String getCruency() {
        return cruency;
    }
    void dispaly(){
        System.out.println("Owner of This Account is : "+ this.accountowner);
        System.out.println("Currency which THe Oner Want to pay:"+ this.cruency);
        System.out.println("Amount is : "+ this.amount);

    }
    abstract   double calculateFee();
    abstract  double calculateTax();
    abstract void processpayment();
    
}
