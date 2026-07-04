public class CreditCard extends PaymentMethod {
    private String Cardnumber;
    private String Expirydate;

    public CreditCard(String Cardnumber, String Expirydate) {
        this.Cardnumber = Cardnumber;
        this.Expirydate = Expirydate;
    }

    public CreditCard(String Cardnumber, String Expirydate, double amount, String cruency, String accountowner) {
        super(amount, cruency, accountowner);
        this.Cardnumber = Cardnumber;
        this.Expirydate = Expirydate;
    }

    public void setCardnumber(String Cardnumber) {
        this.Cardnumber = Cardnumber;
    }

    public void setExpirydate(String Expirydate) {
        this.Expirydate = Expirydate;
    }

    public String getCardnumber() {
        return Cardnumber;
    }

    public String getExpirydate() {
        return Expirydate;
    }

    @Override
    void dispaly() {
        super.dispaly();
         System.out.println("Card Number is : " + this.Cardnumber);
        System.out.println("Expiary DAte of this Card is:"+ this.Expirydate);
    }

    @Override
    double calculateFee() {
        return this.getAmount()*0.02;
    }

    @Override
    double calculateTax() {
        return this.getAmount()*0.05;
     
    }

    @Override
    void processpayment() {
       System.out.println("Payment processed via Credit Card for ["+this.getAccountowner()+"]");
    }
    
    

    
    
}
