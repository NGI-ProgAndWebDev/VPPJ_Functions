public class Person {
 
 private String name;
 private String lastName;
 private String age;
 private double weight;
 private double height;
 private double bmi;
 public String getName() {
 
 System.out.println("What is your name? ");
 name = sc.nextInt();
 
 return name;
 }
 public void setName(String name) {
 this.name = name;
 }
 public String getAge() {
 
 System.out.println("What is your age? ");
 age = sc.nextInt();
 
 return age;
 }
 public void setAge(String age) {
 this.age = age;
 }
 public String getLastName() {
 
 System.out.println("What is your surname? ");
 lastName = sc.nextInt();
 
 return lastName;
}
 public void setLastName(String lastName) {
 this.lastName = lastName;
 }
 /**
 * @return
 */
public double getWeight() {
 
 System.out.println("What is your weight? ");
 weight = sc.nextDouble();
 
 
 return weight;
 }
 public void setWeight(double weight) {
 this.weight = weight;
 }
 public double getHeight() {
 
 System.out.println("What is your height? ");
 height = sc.nextDouble();
 
 return height;
 }
 public void setHeight(double height) {
 this.height = height;
 }
 public double getBmi() {
 
 bmi = getHeight()/getWeight();
 
 return bmi;
 }
 public void setBmi(double bmi) {
 this.bmi = bmi;
 }
 
 Scanner sc = new Scanner();
 /**
 * @param args the command line arguments
 */
 public static void main(String[] args) {
 
 Person p1 = new Person();
System.out.println("\nOur person is "+p1.getName()+""
 + "\nTheir surname is: "+p1.getLastName()+""
 + "\nTheir age is: "+p1.getAge()+""
 + "\nAnd their BMI is: "+p1.getBmi());
 
 Person p2 = new Person();
 
 System.out.println("\nOur person is "+p2.getName()+""
 + "\nTheir surname is: "+p2.getLastName()+""
 + "\nTheir age is: "+p2.getAge()+""
 + "\nAnd their BMI is: "+p2.getBmi());
 }
 
}