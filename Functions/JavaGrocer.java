public class JavaGrocer {
    public static void main(String[] args) {
        String[] aisles = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        
        System.out.println("Do you sell coffee?");
        for (int i = 0; i < aisles.length; i++) {
            if (aisles[i].equals("coffee")) {
                System.out.println("We have that in aisle: " + i);
                break;
            }
        }
    }
}

