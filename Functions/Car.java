public class Car {//creating a car object
    
     String make;
    double price;
    int year;
    String colour;
    

public class Main{ //this uses the object created in Car
    public static void main(String[] args) {
        //a car is identified by its make, price, year and colour
        //each car must drive to the nearest exit

        Car nissan = new Car();
        nissan.make = "Nissan";
        nissan.price= 100000;
        nissan.year = 2020;
        nissan.colour= "white";

        Car toyota = new Car();
        toyota.make = "Toyota";
        toyota.price= 120000;
        toyota.year = 2021;
        toyota.colour= "yellow";

         System.out.println("This " + nissan.make + " is worth R" + nissan.price + 
        ". It was built in " + nissan.year + ". It is " + nissan.colour + ".\n");
        System.out.println("This " + toyota.make + " is worth R " + toyota.price + " built in " +toyota.year+ " the colour is " + toyota.colour + "." );
    }
}
}

