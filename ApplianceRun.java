public class ApplianceRun {
    public static void main(String[] args) {
        WashingMachine w1=new WashingMachine(25, 56, 34);
        System.out.println("=-===========Energy of Washing Machine ====================");
        w1.CalculateEnergy();
        System.out.println("====================working of this Appliance================");
       w1.Operate();
         System.out.println("====================Washing Machine ================");
        w1.dispaly();
          System.out.println("==================== Energy of Refrigerator ================");
        Refrigerator r1=new Refrigerator(34, 34, 56);
        r1.CalculateEnergy();
          System.out.println("====================working of this Appliance================");
          r1.Operate();
            System.out.println("====================  Refrigerator ================");
            r1.dispaly();
    }
    
}
