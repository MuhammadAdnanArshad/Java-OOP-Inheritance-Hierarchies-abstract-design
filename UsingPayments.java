public class UsingPayments {
    public static void main(String[] args) {
        CreditCard c1=new CreditCard("123344", "1234-5678-9012", 10000, "pkr", "Ali");
        System.out.println("=========================CreditCard================================");
        c1.dispaly();
        System.out.println("Fee :"+ c1.calculateFee());
        System.out.println("Tax: "+ c1.calculateTax());
        c1.processpayment();
        System.out.println("========================= PayPal================================");
         PayPal pp=new PayPal("251400188", 23400, "USD", "Adnan");
        pp.dispaly();
          System.out.println("Fee: " + pp.calculateFee());
        System.out.println("Tax: " + pp.calculateTax());
       pp.processpayment();
       System.out.println("========================= Cash ================================");
       Cash cc=new Cash(25000, 24000, "PKR", "XYZ");
       cc.dispaly();
         System.out.println("Fee: " + cc.calculateFee());
        System.out.println("Tax: " + cc.calculateTax());
        cc.processpayment();
  
    }
    
}
