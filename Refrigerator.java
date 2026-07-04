public class Refrigerator  extends Appliance{
    private  double  Temperature;

    public Refrigerator(double  Temperature , double powerRating, double Usagehours) {
          super(powerRating, Usagehours);
          this.Temperature=Temperature;

    }
    
    
    
    public void setTemperature(double Temperature) {
        this.Temperature = Temperature;
    }


    public double getTemperature() {
        return Temperature;
    }
   

    @Override
    public void CalculateEnergy() {
        double total = (this.getPowerRating() * this.getUsagehours())/100;
        if(Temperature<5){
            total*=0.2;
        }
        System.out.println("ToTal Energy is "+ total);
    }

    @Override
    void Operate() {
        System.out.println("Cooling Food .......");
    }
    @Override
    void dispaly() {
        super.dispaly();
        System.out.println(" Temperture of tehy V is : "+ this.Temperature);
    }



    


    
    
}
