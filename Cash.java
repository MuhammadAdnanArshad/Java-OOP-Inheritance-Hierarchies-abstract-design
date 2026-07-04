public class Cash extends PaymentMethod {
    private double Cashrecived;

    public Cash(double Cashrecived) {
        this.Cashrecived = Cashrecived;
    }

    public Cash(double Cashrecived, double amount, String cruency, String accountowner) {
        super(amount, cruency, accountowner);
        this.Cashrecived = Cashrecived;
    }

    public void setCashrecived(double Cashrecived) {
        this.Cashrecived = Cashrecived;
    }

    public double getCashrecived() {
        return Cashrecived;
    }

    @Override
    void dispaly() {
        super.dispaly();
        System.out.println("Cash is recievd is :"+ this.Cashrecived);
    }

    @Override
    double calculateFee() {
       return 0;
    }

    @Override
    double calculateTax() {
       return this.getAmount()*0.05;
    }

    @Override
    void processpayment() {
       if(Cashrecived>=calculateFee()){
        System.out.println("Cash payment successful for ["+this.getAccountowner()+"]");
       }
       else{
        System.out.println("Insufficient cash for ["+this.getAccountowner()+"]");
       }
    }
    
    
    
    

}
