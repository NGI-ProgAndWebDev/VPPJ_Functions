public class Parameters {
    

    public static void main(String[] args) {
       calcArea(2.5, 2.3);
       calcArea(7.5, 8.7);
       calcArea(4.7, 2.9);
        
    }
    public static void calcArea(double length , double width) {

        double area = length * width ; 

        System.out.println("Area: " + area);
        
    }
    public String toString(){
        return "Parameters []"; 
    }


}
