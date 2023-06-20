public class mainG {// uses carG
    /**
     * @param args
     */
    public static void main(String[] args) {
        CarG nissanG = new CarG("Nissan", 100000, 2020, "white");
        CarG toyotaG = new CarG("Toyota", 120000, 2021, "yellow");
        CarG mercedesG = new CarG("Mercedes", 500000, 2022,"red");
        CarG BMWG = new CarG("BMW ", 650000, 2023, "blue" );
        CarG UnoG = new CarG("Uno", 25000, 1997, "Grey");

        nissanG.setColour("Jet Black");
        toyotaG.setColour("Snow White");
        mercedesG.setColour("Red");
        BMWG.setColour("Blue");
        UnoG.setColour("Grey");


        nissanG.setPrice(nissanG.getPrice() / 2);
        toyotaG.setPrice(toyotaG.getPrice() / 2);
        mercedesG.setPrice(mercedesG.getPrice() / 2);
        BMWG.setPrice(BMWG.getPrice() / 2);
        UnoG.setPrice(UnoG.getPrice() / 2);
    
        
         System.out.println("This " + nissanG.getMake() + " is worth R" + nissanG.getPrice() + 
        ". It was built in " + nissanG.getYear() + ". It is " + nissanG.getColour() + ".\n");
        System.out.println("This " + toyotaG.getMake() + " is worth R" + toyotaG.getPrice() + 
        ". It was built in " + toyotaG.getYear() + ". It is " + toyotaG.getColour() + ".\n");
        System.out.println("This " + mercedesG.getMake() + " is worth R" + mercedesG.getPrice() +
        ". It was built in " + mercedesG.getYear() + ". It is " + mercedesG.getColour() + ".\n");
        System.out.println("This " + BMWG.getMake() + " is worth R" + BMWG.getPrice() + 
        ". It was built in " + BMWG.getYear() + ". It is" + BMWG.getColour() + ".\n");
        System.out.println("This " + UnoG.getMake() + "is worth R" + UnoG.getPrice() +
        ". It was built in" + UnoG.getYear() + ". It is" + UnoG.getColour() + ".\n");
}
}
/**HOMEWORK.

Add 3 more cars

1. Red Merc made in 2022 worth R500000
2. Blue BMW made in 2023 worth R650000
3. Grey Uno made in 1997 worth R25000

The dealership will make a sale where all cars are 20% off*/
    

