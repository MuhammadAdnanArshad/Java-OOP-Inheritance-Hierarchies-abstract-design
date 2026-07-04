class WashingMachine  extends Appliance{
    private  double LoadCapicty;

   
    

    public WashingMachine(double LoadCapicty, double powerRating, double Usagehours) {
        super(powerRating, Usagehours);
        this.LoadCapicty = LoadCapicty;
    }

   
    public void setLoadCapicty(double loadCapicty) {
        LoadCapicty = loadCapicty;
    }

    public double getLoadCapicty() {
        return LoadCapicty;
    }
 @Override
    public void CalculateEnergy() {
      double total =(this.getPowerRating()*this.getUsagehours())/1000+(this.LoadCapicty*0.1);
    System.out.println(" Total Energy is: "+ total);
    }

    @Override
    void Operate() {
       System.out.println("Washing clothes...");
    }
    @Override
    void dispaly() {
        super.dispaly();
        System.out.println("The Capicaty of the Load is : "+ this.LoadCapicty);
    }

   
    
 
}
    