public class Parameters { //populate inside brackets
                        // arguements are what you put inside the brack
    
    public static void main (String [] args){
        calculateArea(2.3, 3.6);
        calculateArea(1.7, 2.8);
        calculateArea(2.2, 4.2);
    }

    public static void calculateArea(double length, double width){
        double area = length * width;
        
        System.out.println("Area: "+ area);
    
    }

    @Override
    public String toString() {
        return "Parameters []";
    }
    
}
    
