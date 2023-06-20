import java.util.LinkedList;
import java.util.List;

public class ArraysListsAndLinkedLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // create cities ArrayList;
                
         List<String> cities = new LinkedList<>();
                
         cities.add("Paris");
         cities.add("Florence");
         cities.add("Venice");
         cities.add("Versailles");
         cities.add("London");
         cities.add("Petra");
         cities.add("Oslo");
         cities.add("Rome");
         cities.add("Madrid");
         cities.add("Tokyo");
         cities.add("Prague");
         cities.add("Dublin");
         cities.add("Athens");
         cities.add("Marseille");
         cities.add("Chicago");

         System.out.println(cities.size());
         System.out.println(cities.get(5));
         System.out.println(cities.get(8));
         cities.set(2, "Naples");
         cities.remove(5);

    }
    
}