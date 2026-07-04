public class PayPal extends PaymentMethod {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    public PayPal(String email, double amount, String cruency, String accountowner) {
        super(amount, cruency, accountowner);
        this.email = email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
  
    @Override
    void dispaly() {
        if (email.contains("@") && email.contains(".")){
        super.dispaly();
        System.out.println("Email of this Accont is :"+ this.email);
    }
    else{
        System.out.println("Inavelid Email: Please enter Again ");
    }
    }
    @Override
    double calculateFee() {
        if (!email.contains("@") && !email.contains(".")){
         System.out.println("Inavelid Email: Please enter Again ");
            
        }
        return this.getAmount()*0.03+1;
    }

    @Override
    double calculateTax() {
       return this.getAmount()*0.05;
    }

    @Override
    void processpayment() {
        System.out.println("Payment processed via PayPal for  [" + this.getAccountowner()+"]");
    }
    

}
