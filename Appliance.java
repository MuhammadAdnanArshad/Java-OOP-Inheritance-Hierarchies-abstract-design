
public abstract  class Appliance {
    private double powerRating;
    private double Usagehours;

    public Appliance(double powerRating, double Usagehours) {
        this.powerRating = powerRating;
        this.Usagehours = Usagehours;
    }

    public void setPowerRating(double powerRating) {
        this.powerRating = powerRating;
    }

    public void setUsagehours(double Usagehours) {
        this.Usagehours = Usagehours;
    }

    public double getPowerRating() {
        return powerRating;
    }

    public double getUsagehours() {
        return Usagehours;
    }
    void dispaly(){
        System.out.println("Rating of Power is:"+ this.powerRating);
        System.out.println("Hours of Usage is : "+ this.Usagehours);
    }
   public  abstract void CalculateEnergy();
   abstract  void Operate();
    


}
