public class Main2 {// uses car2 object with contstructor
    public static void main(String[] args) {
        Car2 nissan2 = new Car2("Nissan", 100000, 2020, "white");
        Car2 toyota2 = new Car2("Toyota", 120000, 2021, "Yellow");

         System.out.println("This " + nissan2.make + " is worth R" + nissan2.price + 
        ". It was built in " + nissan2.year + ". It is " + nissan2.colour + ".\n");
        System.out.println("This " + toyota2.make + " is worth R" + toyota2.price + 
        ". It was built in " + toyota2.year + ". It is " + toyota2.colour + ".\n");
}
}
    

