
    public class CarG { // creating a CarG object that uses getters and setters
    
    //each field is now private to the class it was defined in,
    // it is now not visible anywhere else
 private String make;
    private double price;
    private int year;
    private String colour;

    public CarG(String make, double price, int year, String colour){
        this.make = make;
        this.price = price;
        this.year = year;
        this.colour = colour;

    }
    // creating getter
    public String getMake(){
        return make;
    }
    // creating setter for above getter
    public void setMake(String make){
        this.make = make; // using keyword "this" to distinguish between the field and the parameter that gets passed in
    }

     public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

     public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }


     public String getColour(){
        return colour;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
}

